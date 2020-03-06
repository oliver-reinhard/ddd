package com.mimacom.ddd.pub.pub;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class PubPlatformUtil {
  /**
   * Get the workspace resource file for the given fileUri.
   * 
   * @return {@code null} if no file with the given name URI was found.
   * 
   * The fileUri can be a path relative to the given context resource (typically the actual PUB resource)
   * or a platform URI (starting with "platform:/resource/...")
   */
  public IFile resourceFile(final Resource context, final URI fileUri) {
    URI platformUri = fileUri;
    boolean _isPlatformResource = fileUri.isPlatformResource();
    boolean _not = (!_isPlatformResource);
    if (_not) {
      final URI resourceUri = context.getURI();
      final URI baseUri = resourceUri.trimSegments(1);
      platformUri = URI.createPlatformResourceURI(baseUri.toPlatformString(true), true).appendSegments(
        fileUri.segments());
    }
    ResourcesPlugin _plugin = ResourcesPlugin.getPlugin();
    Bundle _bundle = null;
    if (_plugin!=null) {
      _bundle=_plugin.getBundle();
    }
    int _state = _bundle.getState();
    boolean _tripleEquals = (_state == Bundle.ACTIVE);
    if (_tripleEquals) {
      final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
      String _platformString = platformUri.toPlatformString(true);
      Path _path = new Path(_platformString);
      final IFile file = root.getFile(_path);
      return file;
    }
    return null;
  }
}
