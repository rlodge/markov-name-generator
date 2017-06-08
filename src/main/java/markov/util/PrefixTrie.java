// Generated by Haxe 3.4.2
package markov.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class PrefixTrie extends haxe.lang.HxObject
{
	public PrefixTrie(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public PrefixTrie()
	{
		//line 18 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		markov.util.PrefixTrie.__hx_ctor_markov_util_PrefixTrie(this);
	}
	
	
	public static void __hx_ctor_markov_util_PrefixTrie(markov.util.PrefixTrie __hx_this)
	{
		//line 19 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		__hx_this.root = new markov.util.PrefixNode(null, "", 0);
	}
	
	
	public static markov.util.PrefixNode findChild(markov.util.PrefixNode node, java.lang.String letter)
	{
		//line 109 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 109 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			int _g = 0;
			//line 109 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			haxe.root.Array<markov.util.PrefixNode> _g1 = node.children;
			//line 109 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			while (( _g < _g1.length ))
			{
				//line 109 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				markov.util.PrefixNode child = _g1.__get(_g);
				//line 109 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				 ++ _g;
				//line 110 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				if (haxe.lang.Runtime.valEq(child.letter, letter)) 
				{
					//line 111 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					return child;
				}
				
			}
			
		}
		
		//line 114 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		return null;
	}
	
	
	public markov.util.PrefixNode root;
	
	public int insert(java.lang.String word)
	{
		//line 29 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		markov.util.PrefixNode current = this.root;
		//line 31 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 31 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			int _g1 = 0;
			//line 31 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			int _g = word.length();
			//line 31 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			while (( _g1 < _g ))
			{
				//line 31 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				int i = _g1++;
				//line 32 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				java.lang.String ch = haxe.lang.StringExt.charAt(word, i);
				//line 33 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				markov.util.PrefixNode child = markov.util.PrefixTrie.findChild(current, ch);
				//line 34 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				if (( child == null )) 
				{
					//line 35 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					child = new markov.util.PrefixNode(current, ch, i);
					//line 36 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					current.children.push(child);
				}
				else
				{
					//line 38 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					child.frequency++;
				}
				
				//line 40 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				current = child;
			}
			
		}
		
		//line 43 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		current.word = true;
		//line 45 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		return current.frequency;
	}
	
	
	public boolean find(java.lang.String word)
	{
		//line 55 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		markov.util.PrefixNode current = this.root;
		//line 57 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 57 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			int _g1 = 0;
			//line 57 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			int _g = word.length();
			//line 57 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			while (( _g1 < _g ))
			{
				//line 57 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				int i = _g1++;
				//line 58 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				current = markov.util.PrefixTrie.findChild(current, haxe.lang.StringExt.charAt(word, i));
				//line 59 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				if (( current == null )) 
				{
					//line 60 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					return false;
				}
				
			}
			
		}
		
		//line 64 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		if ( ! (current.word) ) 
		{
			//line 65 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			return false;
		}
		
		//line 68 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		return true;
	}
	
	
	public haxe.root.Array<java.lang.String> getWords()
	{
		//line 77 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		haxe.root.List<markov.util.PrefixNode> queue = new haxe.root.List<markov.util.PrefixNode>();
		//line 78 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		queue.add(this.root);
		//line 79 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		haxe.root.Array<java.lang.String> words = new haxe.root.Array<java.lang.String>();
		//line 81 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		while ( ! (queue.isEmpty()) )
		{
			//line 82 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			markov.util.PrefixNode node = ((markov.util.PrefixNode) (queue.pop()) );
			//line 84 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (node.word) 
			{
				//line 85 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				java.lang.String word = node.letter;
				//line 86 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				markov.util.PrefixNode parent = node.parent;
				//line 87 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				while (( parent != null ))
				{
					//line 88 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					word += parent.letter;
					//line 89 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					parent = parent.parent;
				}
				
				//line 91 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				if ( ! ((((boolean) (( word != null )) ))) ) 
				{
					//line 91 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					throw haxe.lang.HaxeException.wrap("FAIL: str != null");
				}
				
				//line 91 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				haxe.root.Array<java.lang.String> arr = haxe.lang.StringExt.split(word, "");
				//line 91 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				arr.reverse();
				//line 91 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				words.push(arr.join(""));
			}
			
			//line 94 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			{
				//line 94 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				int _g = 0;
				//line 94 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				haxe.root.Array<markov.util.PrefixNode> _g1 = node.children;
				//line 94 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				while (( _g < _g1.length ))
				{
					//line 94 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					markov.util.PrefixNode child = _g1.__get(_g);
					//line 94 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					 ++ _g;
					//line 95 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					queue.add(child);
				}
				
			}
			
		}
		
		//line 99 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		return words;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			switch (field.hashCode())
			{
				case 3506402:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("root")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						this.root = ((markov.util.PrefixNode) (value) );
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return value;
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
			}
			
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			switch (field.hashCode())
			{
				case 1969144051:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("getWords")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getWords")) );
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 3506402:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("root")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.root;
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 3143097:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("find")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "find")) );
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -1183792455:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("insert")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "insert")) );
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
			}
			
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		{
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			boolean __temp_executeDef1 = true;
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			switch (field.hashCode())
			{
				case 1969144051:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("getWords")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.getWords();
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case -1183792455:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("insert")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.insert(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
				case 3143097:
				{
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					if (field.equals("find")) 
					{
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						__temp_executeDef1 = false;
						//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
						return this.find(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
					break;
				}
				
				
			}
			
			//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
			if (__temp_executeDef1) 
			{
				//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		baseArr.push("root");
		//line 9 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/PrefixTrie.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


