package com.mimacom.ddd.pub.pub

import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.osgi.framework.Bundle

class PubPlatformUtil {
	/**
	 * Get the workspace resource file for the given fileUri.
	 * 
	 * @return {@code null} if no file with the given name URI was found.
	 * 
	 * The fileUri can be a path relative to the given context resource (typically the actual PUB resource) 
	 * or a platform URI (starting with "platform:/resource/...")
	 */
	def IFile resourceFile(Resource context, URI fileUri) {
		var platformUri = fileUri
		if (! fileUri.isPlatformResource) {
			val resourceUri = context.URI
			val baseUri = resourceUri.trimSegments(1)
			platformUri = URI.createPlatformResourceURI(baseUri.toPlatformString(true), true).appendSegments(
				fileUri.segments)
		}
		if (ResourcesPlugin.plugin?.bundle.state === Bundle.ACTIVE) {
			val root = ResourcesPlugin.workspace.root
			val file = root.getFile(new Path(platformUri.toPlatformString(true)));
			return file
		}
		return null
	}
}
