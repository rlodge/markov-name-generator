// Generated by Haxe 3.4.2
package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class HaxeException extends java.lang.RuntimeException
{
	public static final long serialVersionUID = 5956463319488556322L;public HaxeException(java.lang.Object obj, java.lang.String msg, java.lang.Throwable cause)
	{
		//line 49 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		super(msg, cause);
		//line 51 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		if (( obj instanceof haxe.lang.HaxeException )) 
		{
			//line 53 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
			haxe.lang.HaxeException _obj = ((haxe.lang.HaxeException) (obj) );
			//line 54 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
			obj = _obj.getObject();
		}
		
		//line 57 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		this.obj = obj;
	}
	
	
	public static java.lang.RuntimeException wrap(java.lang.Object obj)
	{
		//line 88 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		java.lang.RuntimeException ret = null;
		//line 89 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		if (( obj instanceof java.lang.RuntimeException )) 
		{
			//line 90 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
			ret = ((java.lang.RuntimeException) (obj) );
		}
		else
		{
			//line 91 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
			if (( obj instanceof java.lang.String )) 
			{
				//line 92 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
				ret = new haxe.lang.HaxeException(obj, haxe.lang.Runtime.toString(obj), null);
			}
			else
			{
				//line 93 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
				if (( obj instanceof java.lang.Throwable )) 
				{
					//line 94 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
					ret = new haxe.lang.HaxeException(obj, haxe.root.Std.string(obj), ((java.lang.Throwable) (obj) ));
				}
				else
				{
					//line 96 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
					ret = new haxe.lang.HaxeException(obj, haxe.root.Std.string(obj), null);
				}
				
			}
			
		}
		
		//line 97 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		return ret;
	}
	
	
	public java.lang.Object obj;
	
	public java.lang.Object getObject()
	{
		//line 62 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		return this.obj;
	}
	
	
	@Override public java.lang.Throwable fillInStackTrace()
	{
		//line 68 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		return this;
	}
	
	
	@Override public java.lang.String toString()
	{
		//line 74 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		return ( "Haxe Exception: " + haxe.root.Std.string(this.obj) );
	}
	
	
	@Override public java.lang.String getMessage()
	{
		//line 79 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		java.lang.String _g = super.getMessage();
		//line 81 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
		if (( _g == null )) 
		{
			//line 81 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
			return haxe.root.Std.string(this.obj);
		}
		else
		{
			//line 82 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
			java.lang.String message = _g;
			//line 82 "/usr/local/lib/haxe/std/java/internal/Exceptions.hx"
			return message;
		}
		
	}
	
	
}


