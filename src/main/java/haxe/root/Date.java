// Generated by Haxe 3.4.2
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Date extends haxe.lang.HxObject
{
	public Date(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Date(int year, int month, int day, int hour, int min, int sec)
	{
		//line 30 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		haxe.root.Date.__hx_ctor__Date(this, year, month, day, hour, min, sec);
	}
	
	
	public static void __hx_ctor__Date(haxe.root.Date __hx_this, int year, int month, int day, int hour, int min, int sec)
	{
		//line 33 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		if (( year != 0 )) 
		{
			//line 33 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			year -= 1900;
		}
		else
		{
			//line 33 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			year = 0;
		}
		
		//line 34 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		__hx_this.date = new java.util.Date(year, month, day, hour, min, sec);
	}
	
	
	public static haxe.root.Date now()
	{
		//line 94 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		haxe.root.Date d = new haxe.root.Date(0, 0, 0, 0, 0, 0);
		//line 95 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		d.date = new java.util.Date();
		//line 96 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		return d;
	}
	
	
	public java.util.Date date;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		{
			//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			switch (field.hashCode())
			{
				case 3076014:
				{
					//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
					if (field.equals("date")) 
					{
						//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
						this.date = ((java.util.Date) (value) );
						//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
						return value;
					}
					
					//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		{
			//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			boolean __temp_executeDef1 = true;
			//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			switch (field.hashCode())
			{
				case 3076014:
				{
					//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
					if (field.equals("date")) 
					{
						//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
						__temp_executeDef1 = false;
						//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
						return this.date;
					}
					
					//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
					break;
				}
				
				
			}
			
			//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
			if (__temp_executeDef1) 
			{
				//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		baseArr.push("date");
		//line 26 "/usr/local/lib/haxe/std/java/_std/Date.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


