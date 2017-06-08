// Generated by Haxe 3.4.2
package markov.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PrefixNode extends haxe.lang.HxObject
{
	public PrefixNode(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PrefixNode(markov.util.PrefixNode parent, java.lang.String letter, int depth)
	{
		//line 161 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		markov.util.PrefixNode.__hx_ctor_markov_util_PrefixNode(this, parent, letter, depth);
	}
	
	
	public static void __hx_ctor_markov_util_PrefixNode(markov.util.PrefixNode __hx_this, markov.util.PrefixNode parent, java.lang.String letter, int depth)
	{
		//line 162 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		if ( ! ((((boolean) (( ( letter.length() == 1 ) || ( ( parent == null ) && ( ((int) (depth) ) == 0 ) ) )) ))) ) 
		{
			//line 162 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			throw haxe.lang.HaxeException.wrap("FAIL: letter.length == 1 || (parent == null && depth == 0)");
		}
		
		//line 164 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		__hx_this.parent = parent;
		//line 165 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		__hx_this.children = new haxe.root.Array<markov.util.PrefixNode>();
		//line 166 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		__hx_this.letter = letter;
		//line 167 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		__hx_this.depth = depth;
		//line 168 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		__hx_this.frequency = 1;
		//line 169 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		__hx_this.word = false;
	}
	
	
	public markov.util.PrefixNode parent;
	
	public haxe.root.Array<markov.util.PrefixNode> children;
	
	public java.lang.String letter;
	
	public int depth;
	
	public int frequency;
	
	public boolean word;
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			boolean __temp_executeDef1 = true;
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			switch (field.hashCode())
			{
				case -70023844:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("frequency")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.frequency = ((int) (value) );
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 95472323:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("depth")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.depth = ((int) (value) );
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
			}
			
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (__temp_executeDef1) 
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			boolean __temp_executeDef1 = true;
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			switch (field.hashCode())
			{
				case 3655434:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("word")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.word = haxe.lang.Runtime.toBool(value);
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -995424086:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("parent")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.parent = ((markov.util.PrefixNode) (value) );
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -70023844:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("frequency")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.frequency = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 1659526655:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("children")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.children = ((haxe.root.Array<markov.util.PrefixNode>) (value) );
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 95472323:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("depth")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.depth = ((int) (haxe.lang.Runtime.toInt(value)) );
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -1106172890:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("letter")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.letter = haxe.lang.Runtime.toString(value);
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
			}
			
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (__temp_executeDef1) 
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			boolean __temp_executeDef1 = true;
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			switch (field.hashCode())
			{
				case 3655434:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("word")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.word;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -995424086:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("parent")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.parent;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -70023844:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("frequency")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.frequency;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 1659526655:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("children")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.children;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 95472323:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("depth")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.depth;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -1106172890:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("letter")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.letter;
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
			}
			
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (__temp_executeDef1) 
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			boolean __temp_executeDef1 = true;
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			switch (field.hashCode())
			{
				case -70023844:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("frequency")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return ((double) (this.frequency) );
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 95472323:
				{
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("depth")) 
					{
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return ((double) (this.depth) );
					}
					
					//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
			}
			
			//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (__temp_executeDef1) 
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		baseArr.push("word");
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		baseArr.push("frequency");
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		baseArr.push("depth");
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		baseArr.push("letter");
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		baseArr.push("children");
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		baseArr.push("parent");
		//line 121 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}

