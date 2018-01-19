
import java.io.*; 
import java.util.*; 
import ajparser.*;  class  AspectJCollector  extends AspectJParser {
	

	protected Statistics stats = new Statistics();

	
	static protected int failures = 0;

	

	@featureHouse.FeatureAnnotation(name="Base")
AspectJCollector(InputStream in) {
		super(in);
	}

	


public boolean parseFile(String filename) throws FileNotFoundException, IOException {
		return parseString(loadFile(filename));
	}

	


private StringBuffer loadFile(String fileName) throws FileNotFoundException, IOException {
		StringBuffer fileContent = new StringBuffer();
		FileReader f = new FileReader(fileName);
		char[] buf = new char[1000];

		int sz = 0;
		int l = 0;
		while ( (sz = f.read(buf)) > 0)
		{
			fileContent.append(buf);
			l += sz;
		}

		fileContent.setLength(l);
		return fileContent;
	}

	

	@featureHouse.FeatureAnnotation (name="Base")
boolean parseString__before__CodeFormatter(StringBuffer buffer) {
		StringReader reader = new StringReader(buffer.toString());
		//System.out.println(buffer.toString());
		ReInit(reader);
		try {
			long startTime = System.currentTimeMillis();
			CompilationUnit();
			long parseTime = System.currentTimeMillis() - startTime;
			return true;
		} catch (ParseException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	

	@featureHouse.FeatureAnnotation(name="CodeFormatter")
boolean  parseString__role__CodeFormatter(StringBuffer buf) {
        comment_remover.Run(buf);
		return parseString__before__CodeFormatter(buf);
    }

	
	@featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=0, thenFeature="CodeFormatter", elseFeature="Base")
boolean
parseString(StringBuffer buffer) {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_CodeFormatter) {
        return parseString__role__CodeFormatter(buffer);
    } else {
        return parseString__before__CodeFormatter(buffer);
    }
}



	

public static void mainParseString(StringBuffer str) {
		AspectJCollector parser = new AspectJCollector(System.in);
		if(!parser.parseString(str)) {
			System.out.println("failure parsing of input String!");
			failures++;
		} else {
			parser.stats.file_count++;
		}
		parser.printStatistics();
	}

	


public static void main (String[] args) {
		AspectJCollector parser = new AspectJCollector(System.in);
		if (args.length == 0)  {
			System.out.println(parserName + ":  Reading from standard input . . .");
			try {
				parser.CompilationUnit();
			} catch (ParseException e) {
				System.out.println(e.getMessage());
				System.out.println(parserName + ":  Encountered errors during parse.");
			}
		} else {
			for(int i = 0; i < args.length; i++) {
				try {
					System.out.println("looking for files...");
					Vector files = parser.getFileNames(new File(args[i]), null);
					for(int j = 0; j < files.size(); j++) {
						System.out.println("analyzing file: " + ((File)files.get(j)).getName());
						if(!parser.parseFile(((File)files.get(j)).getPath())) {
							System.out.println("failure parsing " + ((File)files.get(j)).getPath() + "!");
							failures++;
						} else {
							parser.stats.file_count++;
						}
					}
				} catch(FileNotFoundException e) {
					System.out.println("*** File not found: " + args[i] + ":\n" + e);
				} catch(IOException e) {
					System.out.println("*** IO error: " + args[i] + ":\n" + e);
				}
			}
		}
		parser.printStatistics();
		System.out.println("===");
		if(failures == 0)
			System.out.println("all files have been parsed");
		else
			System.out.println("" + failures + " file(s) could not been parsed");
	}

	


protected Vector getFileNames(File file, Vector vec) {
		if(vec == null)
			vec = new Vector();

		if(file.isFile()) {
			vec.add(file);
			return vec;    		
		} else {
			System.out.println("including directory: " + file.getPath());
			File[] files = file.listFiles(new AspectJFileFilter());

			if(files != null) {
				for(int i = 0; i < files.length; i++) {
					vec = getFileNames(files[i], vec);
				}
			}
		}
		return vec;
	}

	


protected void printStatistics() {
		stats.print();
	}

	
    static protected CommentRemover comment_remover = new CommentRemover();

	
    @featureHouse.FeatureAnnotation (name="Classes")
public void ClassBody__before__States() throws ParseException {
        int begin = this.token.beginLine;
        super.ClassBody();
        int end = this.token.endLine;
        stats.class_loc += end - begin + 1;      
    }

	
    @featureHouse.FeatureAnnotation(name="States")
public void  ClassBody__role__States() throws ParseException {
    	saveState();
    	aspect_flag = false;   	
    	class_flag = true;
    	interface_flag = false;
    	super.ClassBody();
    	recoverState();
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=4, thenFeature="States", elseFeature="Classes")
public void
ClassBody() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_States) {
        ClassBody__role__States();
    } else {
        ClassBody__before__States();
    }
}



	

    @featureHouse.FeatureAnnotation(name="Classes")
public void UnmodifiedClassDeclaration() throws ParseException {
        super.UnmodifiedClassDeclaration();
        stats.class_count++;        
    }

	
    
    @featureHouse.FeatureAnnotation(name="Classes")
public void ClassDeclaration() throws ParseException {
        super.ClassDeclaration();
        stats.top_class_count++;        
    }

	

    @featureHouse.FeatureAnnotation(name="Classes")
public void NestedClassDeclaration() throws ParseException {
        super.NestedClassDeclaration();
        stats.nested_class_count++;        
    }

	
    @featureHouse.FeatureAnnotation (name="Interfaces")
public void InterfaceMemberDeclaration__before__States() throws ParseException {
        int begin = this.token.beginLine;
        super.InterfaceMemberDeclaration();
        int end = this.token.endLine;
        stats.interface_loc += end - begin + 1;
    }

	
    @featureHouse.FeatureAnnotation(name="States")
public void  InterfaceMemberDeclaration__role__States() throws ParseException {
    	saveState();
    	aspect_flag = false; 
    	class_flag = false; 
    	interface_flag = true;
    	super.InterfaceMemberDeclaration();
		recoverState();
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=5, thenFeature="States", elseFeature="Interfaces")
public void
InterfaceMemberDeclaration() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_States) {
        InterfaceMemberDeclaration__role__States();
    } else {
        InterfaceMemberDeclaration__before__States();
    }
}



	

    @featureHouse.FeatureAnnotation(name="Interfaces")
public void UnmodifiedInterfaceDeclaration() throws ParseException {
        super.UnmodifiedInterfaceDeclaration();
        stats.interface_count++;        
    }

	
    
    @featureHouse.FeatureAnnotation(name="Interfaces")
public void InterfaceDeclaration() throws ParseException {
        super.InterfaceDeclaration();
        stats.top_interface_count++;        
    }

	

    @featureHouse.FeatureAnnotation(name="Interfaces")
public void NestedInterfaceDeclaration() throws ParseException {
        super.NestedInterfaceDeclaration();
        stats.nested_interface_count++;        
    }

	
    @featureHouse.FeatureAnnotation (name="Aspects")
public void AspectBody__before__States() throws ParseException {
        int begin = this.token.beginLine;
        super.AspectBody();
        int end = this.token.endLine;
        stats.aspect_loc += end - begin + 1;
    }

	
    @featureHouse.FeatureAnnotation(name="States")
public void  AspectBody__role__States() throws ParseException {
    	saveState();
    	aspect_flag = true;
    	class_flag = false;
    	interface_flag = false;
    	super.AspectBody();
		recoverState();
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=6, thenFeature="States", elseFeature="Aspects")
public void
AspectBody() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_States) {
        AspectBody__role__States();
    } else {
        AspectBody__before__States();
    }
}



	

    @featureHouse.FeatureAnnotation(name="Aspects")
public void UnmodifiedAspectDeclaration() throws ParseException {
        super.UnmodifiedAspectDeclaration();
        stats.aspect_count++;
    }

	
    
    @featureHouse.FeatureAnnotation(name="Aspects")
public void AspectDeclaration() throws ParseException {
        super.AspectDeclaration();
        stats.top_aspect_count++;        
    }

	

    @featureHouse.FeatureAnnotation(name="Aspects")
public void NestedAspectDeclaration() throws ParseException {
        super.NestedAspectDeclaration();
        stats.nested_aspect_count++;        
    }

	
	protected boolean inter_type_method_flag = false;

	
	protected boolean inter_type_constructor_flag = false;

	
	protected boolean inter_type_field_flag = false;

	
	protected boolean aspect_variable_flag = false;

	
	protected boolean advice_flag = false;

	
	protected boolean method_flag = false;

	
	protected boolean constructor_flag = false;

	
	protected boolean aspect_flag = false;

	
	protected boolean class_flag = false;

	
	protected boolean interface_flag = false;

	
	private boolean tmp_aspect_flag = false;

	
	private boolean tmp_class_flag = false;

	
	private boolean tmp_interface_flag = false;

	
    protected int nested_block_count = 0;

	

    @featureHouse.FeatureAnnotation (name="States")
public void Block__before__ClassMethods() throws ParseException {
        nested_block_count++;
        super.Block();
        nested_block_count--;
    }

	

    @featureHouse.FeatureAnnotation(name="ClassMethods")
public void  Block__role__ClassMethods() throws ParseException {
        int begin = this.token.beginLine;
        super.Block();
        int end = this.token.endLine;
        
        if(method_flag && class_flag && nested_block_count == 0) {
	        stats.class_method_count++;
    	    stats.class_method_loc += end - begin + 1;  
    	}
    }

	
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=7, thenFeature="ClassMethods", elseFeature="States")
public void
Block__before__AspectMethods() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_ClassMethods) {
        Block__role__ClassMethods();
    } else {
        Block__before__ClassMethods();
    }
}



	
    @featureHouse.FeatureAnnotation(name="AspectMethods")
public void  Block__role__AspectMethods() throws ParseException {
        int begin = this.token.beginLine;
        super.Block();
        int end = this.token.endLine;
        
        if(method_flag && aspect_flag && nested_block_count == 0) {
	        stats.aspect_method_count++;
    	    stats.aspect_method_loc += end - begin + 1;  
    	}
    }

	
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=13, thenFeature="AspectMethods", elseFeature="featureSwitch")
public void
Block__before__Advice() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_AspectMethods) {
        Block__role__AspectMethods();
    } else {
        Block__before__AspectMethods();
    }
}



	
    @featureHouse.FeatureAnnotation(name="Advice")
public void  Block__role__Advice() throws ParseException {
        int begin = this.token.beginLine;
        super.Block();
        int end = this.token.endLine;
        
        if(advice_flag && nested_block_count == 0) {
	        stats.advice_count++;
    	    stats.advice_loc += end - begin + 1;  
    	}
    }

	
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=23, thenFeature="Advice", elseFeature="featureSwitch")
public void
Block__before__InterTypeMethods() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_Advice) {
        Block__role__Advice();
    } else {
        Block__before__Advice();
    }
}



	
    @featureHouse.FeatureAnnotation(name="InterTypeMethods")
public void  Block__role__InterTypeMethods() throws ParseException {
        int begin = this.token.beginLine;
        super.Block();
        int end = this.token.endLine;
        
        if(inter_type_method_flag && nested_block_count == 0) {
	        stats.inter_type_method_count++;
    	    stats.inter_type_method_loc += end - begin + 1;  
    	}
    }

	
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=26, thenFeature="InterTypeMethods", elseFeature="featureSwitch")
public void
Block__before__InterTypeConstructors() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterTypeMethods) {
        Block__role__InterTypeMethods();
    } else {
        Block__before__InterTypeMethods();
    }
}



	
    @featureHouse.FeatureAnnotation(name="InterTypeConstructors")
public void  Block__role__InterTypeConstructors() throws ParseException {
        int begin = this.token.beginLine;
        super.Block();
        int end = this.token.endLine;
        
        if(inter_type_constructor_flag && nested_block_count == 0) {
	        stats.inter_type_constructor_count++;
    	    stats.inter_type_constructor_loc += end - begin + 1;  
    	}
    }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=28, thenFeature="InterTypeConstructors", elseFeature="featureSwitch")
public void
Block() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterTypeConstructors) {
        Block__role__InterTypeConstructors();
    } else {
        Block__before__InterTypeConstructors();
    }
}



	
    
    @featureHouse.FeatureAnnotation (name="States")
public void MethodDeclaration__before__InterfaceMethods() throws ParseException {
		method_flag = true;
		super.MethodDeclaration();
		method_flag = false;
    }

	
    
    @featureHouse.FeatureAnnotation(name="InterfaceMethods")
public void  MethodDeclaration__role__InterfaceMethods() throws ParseException {
        int begin = this.token.beginLine;
        super.MethodDeclaration();
        int end = this.token.endLine;
        
        if(interface_flag) {
	        stats.interface_method_count++;
    	}
    }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=11, thenFeature="InterfaceMethods", elseFeature="States")
public void
MethodDeclaration() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterfaceMethods) {
        MethodDeclaration__role__InterfaceMethods();
    } else {
        MethodDeclaration__before__InterfaceMethods();
    }
}



	
    
    @featureHouse.FeatureAnnotation (name="States")
public void ConstructorDeclaration__before__ClassConstructors() throws ParseException {
		constructor_flag = true;
		super.ConstructorDeclaration();
		constructor_flag = false;
    }

	
    
    @featureHouse.FeatureAnnotation(name="ClassConstructors")
public void  ConstructorDeclaration__role__ClassConstructors() throws ParseException {
		super.ConstructorDeclaration();
		int end = this.token.endLine;
		        
        if(class_flag) {
	        stats.class_constructor_count++;
       	    stats.class_constructor_loc += end - constructor_begin + 1;  
       	    constructor_begin = -1;
    	}
    }

	
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=9, thenFeature="ClassConstructors", elseFeature="States")
public void
ConstructorDeclaration__before__AspectConstructors() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_ClassConstructors) {
        ConstructorDeclaration__role__ClassConstructors();
    } else {
        ConstructorDeclaration__before__ClassConstructors();
    }
}



	
    @featureHouse.FeatureAnnotation(name="AspectConstructors")
public void  ConstructorDeclaration__role__AspectConstructors() throws ParseException {
		super.ConstructorDeclaration();
		int end = this.token.endLine;
		        
        if(aspect_flag) {
	        stats.aspect_constructor_count++;
       	    stats.aspect_constructor_loc += end - constructor_begin + 1;  
       	    constructor_begin = -1;
    	}
    }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=15, thenFeature="AspectConstructors", elseFeature="featureSwitch")
public void
ConstructorDeclaration() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_AspectConstructors) {
        ConstructorDeclaration__role__AspectConstructors();
    } else {
        ConstructorDeclaration__before__AspectConstructors();
    }
}



	

    @featureHouse.FeatureAnnotation(name="States")
public void AdviceDeclaration() throws ParseException {
		advice_flag = true;
		super.AdviceDeclaration();
		advice_flag = false;
    }

	
	
	@featureHouse.FeatureAnnotation (name="States")
public void AspectVariableDeclarator__before__AspectFields() throws ParseException {
		aspect_variable_flag = true;
		super.AspectVariableDeclarator();
		aspect_variable_flag = false;
	}

	
	
	@featureHouse.FeatureAnnotation(name="AspectFields")
public void  AspectVariableDeclarator__role__AspectFields() throws ParseException {
        int begin = this.token.beginLine;
        super.AspectVariableDeclarator();
        int end = this.token.endLine;
        
        if(!inter_type_field_flag) {
	        stats.aspect_field_count++;
    	}
    }

	
    @featureHouse.FeatureAnnotation (name="featureSwitch")
@featureHouse.FeatureSwitchID(id=21, thenFeature="AspectFields", elseFeature="States")
public void
AspectVariableDeclarator__before__InterTypeFields() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_AspectFields) {
        AspectVariableDeclarator__role__AspectFields();
    } else {
        AspectVariableDeclarator__before__AspectFields();
    }
}



	
    @featureHouse.FeatureAnnotation(name="InterTypeFields")
public void  AspectVariableDeclarator__role__InterTypeFields() throws ParseException {
        int begin = this.token.beginLine;
        super.AspectVariableDeclarator();
        int end = this.token.endLine;
        
        if(inter_type_field_flag) {
	        stats.inter_type_field_count++;
            inter_type_field_flag = false;
    	}
    }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=30, thenFeature="InterTypeFields", elseFeature="featureSwitch")
public void
AspectVariableDeclarator() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterTypeFields) {
        AspectVariableDeclarator__role__InterTypeFields();
    } else {
        AspectVariableDeclarator__before__InterTypeFields();
    }
}



	
	
    @featureHouse.FeatureAnnotation(name="States")
public void BasicTypePatternDot() throws ParseException {
    	if(aspect_variable_flag == true)
			inter_type_field_flag = true;
		super.BasicTypePatternDot();
    }

	
    
    @featureHouse.FeatureAnnotation(name="States")
public void InterTypeMethodDeclaration() throws ParseException {
		inter_type_method_flag = true;
		super.InterTypeMethodDeclaration();
		inter_type_method_flag = false;
    }

	
    
    @featureHouse.FeatureAnnotation(name="States")
public void InterTypeConstructorDeclaration() throws ParseException {
		inter_type_constructor_flag = true;
		super.InterTypeConstructorDeclaration();
		inter_type_constructor_flag = false;
    }

	
    

private void saveState() {
    	tmp_aspect_flag = aspect_flag;
    	tmp_class_flag = class_flag;
    	tmp_interface_flag = interface_flag;
    }

	
    
    @featureHouse.FeatureAnnotation(name="States")
private void recoverState() {
    	aspect_flag = tmp_aspect_flag;
    	class_flag = tmp_class_flag;
    	interface_flag = tmp_interface_flag;
    }

	
	private int constructor_begin  = -1;

	
    
    @featureHouse.FeatureAnnotation (name="ClassConstructors")
public void FormalParameters__before__AspectConstructors() throws ParseException {
	    int begin = this.token.beginLine;
		super.FormalParameters();
        
        if(class_flag && constructor_flag) {
        	if(constructor_begin == -1)
				constructor_begin = begin;
    	}
    }

	
    
    @featureHouse.FeatureAnnotation(name="AspectConstructors")
public void  FormalParameters__role__AspectConstructors() throws ParseException {
	    int begin = this.token.beginLine;
		super.FormalParameters();
        
        if(aspect_flag && constructor_flag) {
        	if(constructor_begin == -1)
				constructor_begin = begin;
    	}
    }

	
    
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=16, thenFeature="AspectConstructors", elseFeature="ClassConstructors")
public void
FormalParameters() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_AspectConstructors) {
        FormalParameters__role__AspectConstructors();
    } else {
        FormalParameters__before__AspectConstructors();
    }
}



	
    @featureHouse.FeatureAnnotation (name="ClassFields")
public void VariableDeclarator__before__InterfaceFields() throws ParseException {
        int begin = this.token.beginLine;
        super.VariableDeclarator();
        int end = this.token.endLine;

        if(class_flag && !method_flag) {
	        stats.class_field_count++;
    	}
    }

	
    @featureHouse.FeatureAnnotation(name="InterfaceFields")
public void  VariableDeclarator__role__InterfaceFields() throws ParseException {
        int begin = this.token.beginLine;
        super.VariableDeclarator();
        int end = this.token.endLine;

        if(interface_flag && !method_flag) {
	        stats.interface_field_count++;
    	}
    }

	
    @featureHouse.FeatureAnnotation(name="featureSwitch")
@featureHouse.FeatureSwitchID(id=19, thenFeature="InterfaceFields", elseFeature="ClassFields")
public void
VariableDeclarator() throws ParseException {
    if (verificationClasses.FeatureSwitches.__SELECTED_FEATURE_InterfaceFields) {
        VariableDeclarator__role__InterfaceFields();
    } else {
        VariableDeclarator__before__InterfaceFields();
    }
}



	
    @featureHouse.FeatureAnnotation(name="Pointcuts")
public void PointcutDeclaration() throws ParseException {
        int begin = this.token.beginLine;
        super.PointcutDeclaration();
        int end = this.token.endLine;
        
        stats.pointcut_count++;
    }

	
    @featureHouse.FeatureAnnotation(name="InterTypeDeclare")
public void InterTypeDeclareBody() throws ParseException {
        int begin = this.token.beginLine;
        super.InterTypeDeclareBody();
        int end = this.token.endLine;
        
        stats.inter_type_declare_count++;
    }


}
