package com.springcore.ci;

import java.util.List;

public class conctructInject {
        private List<String> lists;
        refrenceclass ref;
        
        
        conctructInject(List<String>lists, refrenceclass ref){
        	
        	this.lists=lists;
        	this.ref=ref;
        	
        }


		@Override
		public String toString() {
			return "conctructInject [lists=" + lists + "]"+ this.ref.name;
		}
        
}
 
    