// Generated by Haxe 3.4.2
package markov.namegen;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Generator___hx_ctor_markov_namegen_Generator_60__Fun extends haxe.lang.Function
{
	public Generator___hx_ctor_markov_namegen_Generator_60__Fun()
	{
		//line 60 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
		super(2, 1);
	}
	
	
	public static markov.namegen.Generator___hx_ctor_markov_namegen_Generator_60__Fun __hx_current;
	
	@Override public double __hx_invoke2_f(double __fn_float1, java.lang.Object __fn_dyn1, double __fn_float2, java.lang.Object __fn_dyn2)
	{
		//line 60 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
		java.lang.String b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float2)) : (haxe.lang.Runtime.toString(__fn_dyn2)) );
		//line 60 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
		java.lang.String a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (haxe.lang.Runtime.toString(__fn_float1)) : (haxe.lang.Runtime.toString(__fn_dyn1)) );
		//line 61 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
		if (( a.compareTo(b) < 0 )) 
		{
			//line 62 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
			return ((double) (-1) );
		}
		
		//line 64 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
		if (( a.compareTo(b) > 0 )) 
		{
			//line 65 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
			return ((double) (1) );
		}
		
		//line 67 "/Users/rlodge/code/misc/MarkovNameGenerator/lib/markov/namegen/Generator.hx"
		return ((double) (0) );
	}
	
	
}


