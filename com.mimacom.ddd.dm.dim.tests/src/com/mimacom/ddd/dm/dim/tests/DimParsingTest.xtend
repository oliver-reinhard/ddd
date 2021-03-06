/*
 * generated by Xtext 2.16.0
 */
package com.mimacom.ddd.dm.dim.tests

import com.google.inject.Inject
import com.mimacom.ddd.dm.base.base.DNamespace
import com.mimacom.ddd.dm.dim.DimPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.jupiter.api.Assertions.*

@ExtendWith(InjectionExtension)
@InjectWith(DimInjectorProvider)
class DimParsingTest {
	@Inject
	ParseHelper<DNamespace> parseHelper
	
	protected static val DIM = DimPackage.eINSTANCE
	
	@Test
	def void parseRestaurantExample() {
		val G1 = "«"
		val G2 = "»"
		val result = parseHelper.parse('''
			domain dm.Restaurant
			
			information model ReservationsDM 
			NOTE M1 { «G1»ReservationsDM
			   '<size:20>Second' </size> **line**«G2» white
			} 
			{
			
				primitive Size redefines Natural  
				NOTE T1 { «G1»Size«G2» blue}
				{
					constraint NonNegative: «G1»value ≥ 0«G2»
				}
			
				primitive Message redefines Text
				
				enumeration Location {
					WINDOW, CENTER, CORNER NOTE L1 {«G1»CORNER«G2»}, TERRACE
				}
			 
				component Tables {
			
					query has_Free_Table(minSeats : Size) : Boolean
					returns Table.all.exists(t | t.details.seats ≥ minSeats AND t.state = Table.FREE)
			
					query estimated_Wait_Time(seats : Size) : Duration 
			
					main autonomous entity Table
					«G1»A table in a restaurant«G2»
					NOTE T2 { «G1»all_Waiting_Parties«G2» }
				 {
						states { FREE, USED }
						events { ALLOCATED, CLEANED} 
						detail details : TableDetails
						party references Party? 
					}
					
					detail TableDetails {
						seats : Size
						location : Location
					}
				}
			
				component Parties {
			
					query all_Waiting_Parties() : Party* 
					returns Party.all.select(p|p.state = Party.WAITING)
					NOTE Q1 { «G1»all_Waiting_Parties«G2» }
			
					query is_Party_Waiting(available_Seats : Size) : Boolean 
					returns Party.all.exists(p | p.state = Party.WAITING AND p.size ≤ available_Seats)
			
					main autonomous entity Party {
						states { ARRIVED, WAITING, SEATED, LEFT }
						events { WAIT, SIT, LEAVE }
						name : Name 
						size : Size
						arrival_Time : Timepoint 	
						NOTE F1 { «G1»arrival_Time«G2» red} // COLOR NOT WORKING
						NOTE F2 { «G1»arrival_Time 2«G2» }
						max_Wait_Time : Duration
						time_waited() : Duration returns  now() - arrival_Time
						NOTE Q2{ «G1»time_waited«G2» }
						waited_more_than(d : Duration) : Boolean returns time_waited > d
						tab contains Tab?
					}
				}
				
				component Reservations 
					NOTE T2 { «G1»Reservations«G2» }
					{
					
					main entity Reservation 
					NOTE T2 { «G1»Reservation«G2» }
					{
						party references Party	 	
						NOTE F3 { «G1»party«G2» }
						preference : Preference?
						NOTE F4 { «G1»preference«G2» }
						table references Table?
					}
					
					detail Preference {
						location : Location
						seats : Size
					}
				}
			}
		''')
		Assertions.assertNotNull(result)
		Assertions.assertNotNull(result.model)
		assertEquals(DIM.domainInformationModel, result.model.eClass)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
