/**
 * This file was auto-generated by mofcomp -j version 1.0.0 on Wed Jan 12
 * 09:21:06 CET 2011.
 */

package org.opennaas.extensions.router.model;

import java.io.*;

/**
 * This Class contains accessor and mutator methods for all properties defined in the CIM class ProductPhysicalComponent as well as methods comparable
 * to the invokeMethods defined for this class. This Class implements the ProductPhysicalComponentBean Interface. The CIM class
 * ProductPhysicalComponent is described as follows:
 * 
 * Indicates that the referenced PhysicalElement is acquired as part of a Product.
 */
public class ProductPhysicalComponent extends Component implements
		Serializable {

	/**
	 * This constructor creates a ProductPhysicalComponentBeanImpl Class which implements the ProductPhysicalComponentBean Interface, and encapsulates
	 * the CIM class ProductPhysicalComponent in a Java Bean. The CIM class ProductPhysicalComponent is described as follows:
	 * 
	 * Indicates that the referenced PhysicalElement is acquired as part of a Product.
	 */
	public ProductPhysicalComponent() {
	};

	/**
	 * This method create an Association of the type ProductPhysicalComponent between one Product object and PhysicalElement object
	 */
	public static ProductPhysicalComponent link(Product
			groupComponent, PhysicalElement partComponent) {

		return (ProductPhysicalComponent) Association.link(ProductPhysicalComponent.class, groupComponent, partComponent);
	}// link

} // Class ProductPhysicalComponent