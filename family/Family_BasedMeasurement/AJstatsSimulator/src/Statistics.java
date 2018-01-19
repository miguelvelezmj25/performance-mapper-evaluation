 class  Statistics {
	
	public int file_count = 0;

	
    
    @featureHouse.FeatureAnnotation (name="Base")
public void print__before__Classes() {
       	System.out.println("---");
    	System.out.println("files (noc):\t\t\t" + file_count);
    }

	
    
    @featureHouse.FeatureAnnotation(name="Classes")
public void  print__role__Classes() {
    	print__before__Classes();
    	System.out.println("---");
        System.out.println("classes (noc):\t\t\t" + class_count);
        System.out.println("top classes (noc):\t\t" + top_class_count);
        System.out.println("nested classes (noc):\t\t" + nested_class_count);
        System.out.println("classes (loc):\t\t\t" + class_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=1, thenFeature="Classes", elseFeature="Base")
public void
print__before__Interfaces() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Classes) {
        print__role__Classes();
    } else {
        print__before__Classes();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="Interfaces")
public void  print__role__Interfaces() {
    	print__before__Interfaces();
        System.out.println("---");        
        System.out.println("interfaces (noc):\t\t" + interface_count);
        System.out.println("top interfaces (noc):\t\t" + top_interface_count);
        System.out.println("nested interfaces (noc):\t" + nested_interface_count);
        System.out.println("interfaces (loc):\t\t" + interface_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=2, thenFeature="Interfaces", elseFeature="featureSwitch")
public void
print__before__Aspects() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Interfaces) {
        print__role__Interfaces();
    } else {
        print__before__Interfaces();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="Aspects")
public void  print__role__Aspects() {
		print__before__Aspects();
        System.out.println("---");
        System.out.println("aspects (noc):\t\t\t" + aspect_count);
        System.out.println("top aspects (noc):\t\t" + top_aspect_count);
        System.out.println("nested aspects (noc):\t\t" + nested_aspect_count);
        System.out.println("aspects (loc):\t\t\t" + aspect_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=3, thenFeature="Aspects", elseFeature="featureSwitch")
public void
print__before__ClassMethods() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Aspects) {
        print__role__Aspects();
    } else {
        print__before__Aspects();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="ClassMethods")
public void  print__role__ClassMethods() {
    	print__before__ClassMethods();
    	System.out.println("---");
        System.out.println("class methods (noc):\t\t" + class_method_count);
        System.out.println("class methods (loc):\t\t" + class_method_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=8, thenFeature="ClassMethods", elseFeature="featureSwitch")
public void
print__before__ClassConstructors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_ClassMethods) {
        print__role__ClassMethods();
    } else {
        print__before__ClassMethods();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="ClassConstructors")
public void  print__role__ClassConstructors() {
    	print__before__ClassConstructors();
    	System.out.println("---");
        System.out.println("class constructors (noc):\t" + class_constructor_count);
        System.out.println("class constructors (loc):\t" + class_constructor_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=10, thenFeature="ClassConstructors", elseFeature="featureSwitch")
public void
print__before__InterfaceMethods() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_ClassConstructors) {
        print__role__ClassConstructors();
    } else {
        print__before__ClassConstructors();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="InterfaceMethods")
public void  print__role__InterfaceMethods() {
    	print__before__InterfaceMethods();
    	System.out.println("---");
        System.out.println("interface methods (noc):\t" + interface_method_count);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=12, thenFeature="InterfaceMethods", elseFeature="featureSwitch")
public void
print__before__AspectMethods() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterfaceMethods) {
        print__role__InterfaceMethods();
    } else {
        print__before__InterfaceMethods();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="AspectMethods")
public void  print__role__AspectMethods() {
    	print__before__AspectMethods();
    	System.out.println("---");
        System.out.println("aspect methods (noc):\t\t" + aspect_method_count);
        System.out.println("aspect methods (loc):\t\t" + aspect_method_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=14, thenFeature="AspectMethods", elseFeature="featureSwitch")
public void
print__before__AspectConstructors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_AspectMethods) {
        print__role__AspectMethods();
    } else {
        print__before__AspectMethods();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="AspectConstructors")
public void  print__role__AspectConstructors() {
    	print__before__AspectConstructors();
    	System.out.println("---");
        System.out.println("aspect constructors (noc):\t" + aspect_constructor_count);
        System.out.println("aspect constructors (loc):\t" + aspect_constructor_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=17, thenFeature="AspectConstructors", elseFeature="featureSwitch")
public void
print__before__ClassFields() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_AspectConstructors) {
        print__role__AspectConstructors();
    } else {
        print__before__AspectConstructors();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="ClassFields")
public void  print__role__ClassFields() {
    	print__before__ClassFields();
    	System.out.println("---");
        System.out.println("class fields (noc):\t\t" + class_field_count);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=18, thenFeature="ClassFields", elseFeature="featureSwitch")
public void
print__before__InterfaceFields() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_ClassFields) {
        print__role__ClassFields();
    } else {
        print__before__ClassFields();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="InterfaceFields")
public void  print__role__InterfaceFields() {
    	print__before__InterfaceFields();
    	System.out.println("---");
        System.out.println("interface fields (noc):\t\t" + interface_field_count);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=20, thenFeature="InterfaceFields", elseFeature="featureSwitch")
public void
print__before__AspectFields() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterfaceFields) {
        print__role__InterfaceFields();
    } else {
        print__before__InterfaceFields();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="AspectFields")
public void  print__role__AspectFields() {
    	print__before__AspectFields();
    	System.out.println("---");
        System.out.println("aspect fields (noc):\t\t" + aspect_field_count);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=22, thenFeature="AspectFields", elseFeature="featureSwitch")
public void
print__before__Advice() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_AspectFields) {
        print__role__AspectFields();
    } else {
        print__before__AspectFields();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="Advice")
public void  print__role__Advice() {
    	print__before__Advice();
    	System.out.println("---");
        System.out.println("advice (noc):\t\t\t" + advice_count);
        System.out.println("advice (loc):\t\t\t" + advice_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=24, thenFeature="Advice", elseFeature="featureSwitch")
public void
print__before__Pointcuts() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Advice) {
        print__role__Advice();
    } else {
        print__before__Advice();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="Pointcuts")
public void  print__role__Pointcuts() {
    	print__before__Pointcuts();
    	System.out.println("---");
        System.out.println("pointcuts (noc):\t\t" + pointcut_count);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=25, thenFeature="Pointcuts", elseFeature="featureSwitch")
public void
print__before__InterTypeMethods() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Pointcuts) {
        print__role__Pointcuts();
    } else {
        print__before__Pointcuts();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="InterTypeMethods")
public void  print__role__InterTypeMethods() {
    	print__before__InterTypeMethods();
    	System.out.println("---");
        System.out.println("inter-type methods (noc):\t" + inter_type_method_count);
        System.out.println("inter-type methods (loc):\t" + inter_type_method_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=27, thenFeature="InterTypeMethods", elseFeature="featureSwitch")
public void
print__before__InterTypeConstructors() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterTypeMethods) {
        print__role__InterTypeMethods();
    } else {
        print__before__InterTypeMethods();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="InterTypeConstructors")
public void  print__role__InterTypeConstructors() {
    	print__before__InterTypeConstructors();
    	System.out.println("---");
        System.out.println("inter-type constructors (noc):\t" + inter_type_constructor_count);
        System.out.println("inter-type constructors (loc):\t" + inter_type_constructor_loc);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=29, thenFeature="InterTypeConstructors", elseFeature="featureSwitch")
public void
print__before__InterTypeFields() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterTypeConstructors) {
        print__role__InterTypeConstructors();
    } else {
        print__before__InterTypeConstructors();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="InterTypeFields")
public void  print__role__InterTypeFields() {
    	print__before__InterTypeFields();
    	System.out.println("---");
        System.out.println("inter-type fields (noc):\t" + inter_type_field_count);
    }

	
    
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=31, thenFeature="InterTypeFields", elseFeature="featureSwitch")
public void
print__before__InterTypeDeclare() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterTypeFields) {
        print__role__InterTypeFields();
    } else {
        print__before__InterTypeFields();
    }
}



	
    
    @featureHouse.FeatureAnnotation(name="InterTypeDeclare")
public void  print__role__InterTypeDeclare() {
    	print__before__InterTypeDeclare();
    	System.out.println("---");
        System.out.println("inter-type declares (noc):\t" + inter_type_declare_count);
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=32, thenFeature="InterTypeDeclare", elseFeature="featureSwitch")
public void
print() {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterTypeDeclare) {
        print__role__InterTypeDeclare();
    } else {
        print__before__InterTypeDeclare();
    }
}



	
	public int class_count = 0;

	
    public int top_class_count = 0;

	
    public int nested_class_count = 0;

	
    public int class_loc = 0;

	
    public int interface_count = 0;

	
    public int top_interface_count = 0;

	
    public int nested_interface_count = 0;

	
    public int interface_loc = 0;

	
	public int aspect_count = 0;

	
    public int top_aspect_count = 0;

	
    public int nested_aspect_count = 0;

	
    public int aspect_loc = 0;

	
	public int class_method_count = 0;

	
    public int class_method_loc = 0;

	
	public int class_constructor_count = 0;

	
    public int class_constructor_loc = 0;

	
	public int interface_method_count = 0;

	
	public int aspect_method_count = 0;

	
    public int aspect_method_loc = 0;

	
	public int aspect_constructor_count = 0;

	
    public int aspect_constructor_loc = 0;

	
	public int class_field_count = 0;

	
	public int interface_field_count = 0;

	
    public int aspect_field_count = 0;

	
	public int advice_count = 0;

	
    public int advice_loc = 0;

	
	public int pointcut_count = 0;

	
	public int inter_type_method_count = 0;

	
    public int inter_type_method_loc = 0;

	
	public int inter_type_constructor_count = 0;

	
    public int inter_type_constructor_loc = 0;

	
    public int inter_type_field_count = 0;

	
	public int inter_type_declare_count = 0;


}
