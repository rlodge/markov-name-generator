// Generated by Haxe 3.4.2
package markov.namegen;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class NameGenerator extends haxe.lang.HxObject
{
	public NameGenerator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public NameGenerator(haxe.root.Array<java.lang.String> data, int order, double prior)
	{
		//line 24 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		markov.namegen.NameGenerator.__hx_ctor_markov_namegen_NameGenerator(this, data, order, prior);
	}
	
	
	public static void __hx_ctor_markov_namegen_NameGenerator(markov.namegen.NameGenerator __hx_this, haxe.root.Array<java.lang.String> data, int order, double prior)
	{
		//line 25 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		__hx_this.generator = new markov.namegen.Generator(data, order, prior);
	}
	
	
	public markov.namegen.Generator generator;
	
	public java.lang.String generateName(int minLength, int maxLength, java.lang.String startsWith, java.lang.String endsWith, java.lang.String includes, java.lang.String excludes)
	{
		//line 40 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		java.lang.String name = "";
		//line 42 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		name = this.generator.generate();
		//line 43 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		name = haxe.root.StringTools.replace(name, "#", "");
		//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		boolean tmp = false;
		//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		boolean tmp1 = false;
		//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		if (( ( ( ( name.length() >= minLength ) && ( name.length() <= maxLength ) ) && name.startsWith(startsWith) ) && name.endsWith(endsWith) )) 
		{
			//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			if (( includes.length() != 0 )) 
			{
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				if ( ! ((((boolean) (( name != null )) ))) ) 
				{
					//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					throw haxe.lang.HaxeException.wrap("FAIL: str != null");
				}
				
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				if ( ! ((((boolean) (( includes != null )) ))) ) 
				{
					//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					throw haxe.lang.HaxeException.wrap("FAIL: substr != null");
				}
				
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				tmp1 = ( haxe.lang.StringExt.indexOf(name, includes, null) >= 0 );
			}
			else
			{
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				tmp1 = true;
			}
			
		}
		else
		{
			//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			tmp1 = false;
		}
		
		//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		if (tmp1) 
		{
			//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			if (( excludes.length() != 0 )) 
			{
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				if ( ! ((((boolean) (( name != null )) ))) ) 
				{
					//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					throw haxe.lang.HaxeException.wrap("FAIL: str != null");
				}
				
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				if ( ! ((((boolean) (( excludes != null )) ))) ) 
				{
					//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					throw haxe.lang.HaxeException.wrap("FAIL: substr != null");
				}
				
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				tmp = ( haxe.lang.StringExt.indexOf(name, excludes, null) < 0 );
			}
			else
			{
				//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				tmp = true;
			}
			
		}
		else
		{
			//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			tmp = false;
		}
		
		//line 44 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		if (tmp) 
		{
			//line 45 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			return name;
		}
		
		//line 48 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		return null;
	}
	
	
	public haxe.root.Array<java.lang.String> generateNames(int n, int minLength, int maxLength, java.lang.String startsWith, java.lang.String endsWith, java.lang.String includes, java.lang.String excludes, java.lang.Object maxTimePerName)
	{
		//line 63 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		double __temp_maxTimePerName1 = ( (haxe.lang.Runtime.eq(maxTimePerName, null)) ? (0.02) : (((double) (haxe.lang.Runtime.toDouble(maxTimePerName)) )) );
		//line 64 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		haxe.root.Array<java.lang.String> names = new haxe.root.Array<java.lang.String>();
		//line 66 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		double startTime = ((double) (haxe.root.Date.now().date.getTime()) );
		//line 67 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		double currentTime = ((double) (haxe.root.Date.now().date.getTime()) );
		//line 69 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		while (( ( names.length < n ) && ( currentTime > ( startTime + ( __temp_maxTimePerName1 * n ) ) ) ))
		{
			//line 70 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			java.lang.String name = this.generateName(minLength, maxLength, startsWith, endsWith, includes, excludes);
			//line 71 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			if (( name != null )) 
			{
				//line 72 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				names.push(name);
			}
			
			//line 75 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			currentTime = ((double) (haxe.root.Date.now().date.getTime()) );
		}
		
		//line 78 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		return names;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		{
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			switch (field.hashCode())
			{
				case 286956243:
				{
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					if (field.equals("generator")) 
					{
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						__temp_executeDef1 = false;
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						this.generator = ((markov.namegen.Generator) (value) );
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						return value;
					}
					
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		{
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			switch (field.hashCode())
			{
				case 1727853267:
				{
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					if (field.equals("generateNames")) 
					{
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						__temp_executeDef1 = false;
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "generateNames")) );
					}
					
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					break;
				}
				
				
				case 286956243:
				{
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					if (field.equals("generator")) 
					{
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						__temp_executeDef1 = false;
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						return this.generator;
					}
					
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					break;
				}
				
				
				case 1718305184:
				{
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					if (field.equals("generateName")) 
					{
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						__temp_executeDef1 = false;
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "generateName")) );
					}
					
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		{
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			boolean __temp_executeDef1 = true;
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			switch (field.hashCode())
			{
				case 1727853267:
				{
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					if (field.equals("generateNames")) 
					{
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						__temp_executeDef1 = false;
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						return this.generateNames(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(2))) ), haxe.lang.Runtime.toString(dynargs.__get(3)), haxe.lang.Runtime.toString(dynargs.__get(4)), haxe.lang.Runtime.toString(dynargs.__get(5)), haxe.lang.Runtime.toString(dynargs.__get(6)), dynargs.__get(7));
					}
					
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					break;
				}
				
				
				case 1718305184:
				{
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					if (field.equals("generateName")) 
					{
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						__temp_executeDef1 = false;
						//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
						return this.generateName(((int) (haxe.lang.Runtime.toInt(dynargs.__get(0))) ), ((int) (haxe.lang.Runtime.toInt(dynargs.__get(1))) ), haxe.lang.Runtime.toString(dynargs.__get(2)), haxe.lang.Runtime.toString(dynargs.__get(3)), haxe.lang.Runtime.toString(dynargs.__get(4)), haxe.lang.Runtime.toString(dynargs.__get(5)));
					}
					
					//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
					break;
				}
				
				
			}
			
			//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
			if (__temp_executeDef1) 
			{
				//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		baseArr.push("generator");
		//line 12 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/NameGenerator.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


