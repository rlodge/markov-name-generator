// Generated by Haxe 3.4.2
package markov.util;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class IntExtensions extends haxe.lang.HxObject
{
	public IntExtensions(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public IntExtensions()
	{
		//line 6 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
		markov.util.IntExtensions.__hx_ctor_markov_util_IntExtensions(this);
	}
	
	
	public static void __hx_ctor_markov_util_IntExtensions(markov.util.IntExtensions __hx_this)
	{
	}
	
	
	public static int clamp(int value, int min, int max)
	{
		//line 15 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
		if (( value < min )) 
		{
			//line 16 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
			return min;
		}
		
		//line 18 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
		if (( value > max )) 
		{
			//line 19 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
			return max;
		}
		
		//line 21 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
		return value;
	}
	
	
	public static int min(int a, int b)
	{
		//line 31 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
		if (( a < b )) 
		{
			//line 32 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
			return a;
		}
		
		//line 34 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/util/IntExtensions.hx"
		return b;
	}
	
	
}


