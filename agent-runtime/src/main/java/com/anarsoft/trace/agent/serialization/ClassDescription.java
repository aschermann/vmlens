package com.anarsoft.trace.agent.serialization;


import com.vmlens.trace.agent.bootstrap.event.StaticEvent;
import java.util.Arrays;
import com.vmlens.trace.agent.bootstrap.event.StreamRepository;
import java.io.DataOutputStream;



public class ClassDescription implements StaticEvent {


	 final String name;
	 final String source;
	 
	 final boolean isThreadSafe;
	 final boolean isStateless;
	 final String[] exceptArray;
	 
	 final String superClass;
	 final String[] interfaces;
	
	
	
	private  MethodDescription[] methodArray;
    private  final SerializedFieldDescription[] serializedFieldDescriptionArray;


	


	public ClassDescription(String name,String source, boolean isThreadSafe ,boolean isStateless , String[] exceptArray ,  MethodDescription[] methodArray,
			SerializedFieldDescription[] serializedFieldDescriptionArray,String superClass , String[] interfaces) {
		super();
		this.name = name;
		this.source = source;
		
		this.isThreadSafe = isThreadSafe;
		this.isStateless = isStateless;
		this.exceptArray = exceptArray;
		
		this.methodArray = methodArray;
		this.serializedFieldDescriptionArray = serializedFieldDescriptionArray;
		
		this.superClass = superClass;
		this.interfaces = interfaces;
		
		
	}



	   public void serialize(StreamRepository streamRepository) throws Exception
	   {
		   (new SerializeDescription()).serialize(this, streamRepository.description.getStream());
		   
		   
		   
	   }


	   
	   public void writeToStream(DataOutputStream stream) throws Exception
		 {
		   (new SerializeDescription()).serialize(this, stream );
		 }   
	   
	   


	


	public MethodDescription[] getMethodArray() {
		return methodArray;
	}





	public SerializedFieldDescription[] getSerializedFieldDescriptionArray() {
		return serializedFieldDescriptionArray;
	}








	@Override
	public String toString() {
		return "ClassAnalyzedEvent [name=" + name + ", methodArray="
				+ Arrays.toString(methodArray) + "]";
	}





}
