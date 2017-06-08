// Generated by Haxe 3.4.2
package _List;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class ListIterator<T> extends haxe.lang.HxObject
{
	public ListIterator(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public ListIterator(_List.ListNode<T> head)
	{
		//line 268 "/usr/local/lib/haxe/std/List.hx"
		_List.ListIterator.__hx_ctor__List_ListIterator(((_List.ListIterator<T>) (this) ), ((_List.ListNode<T>) (head) ));
	}
	
	
	public static <T_c> void __hx_ctor__List_ListIterator(_List.ListIterator<T_c> __hx_this, _List.ListNode<T_c> head)
	{
		//line 269 "/usr/local/lib/haxe/std/List.hx"
		__hx_this.head = head;
	}
	
	
	public _List.ListNode<T> head;
	
	public final boolean hasNext()
	{
		//line 273 "/usr/local/lib/haxe/std/List.hx"
		return ( this.head != null );
	}
	
	
	public final T next()
	{
		//line 277 "/usr/local/lib/haxe/std/List.hx"
		T val = this.head.item;
		//line 278 "/usr/local/lib/haxe/std/List.hx"
		this.head = this.head.next;
		//line 279 "/usr/local/lib/haxe/std/List.hx"
		return val;
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 265 "/usr/local/lib/haxe/std/List.hx"
		{
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 3198432:
				{
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					if (field.equals("head")) 
					{
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						this.head = ((_List.ListNode<T>) (value) );
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						return value;
					}
					
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 265 "/usr/local/lib/haxe/std/List.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 265 "/usr/local/lib/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 265 "/usr/local/lib/haxe/std/List.hx"
		{
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					if (field.equals("next")) 
					{
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "next")) );
					}
					
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					break;
				}
				
				
				case 3198432:
				{
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					if (field.equals("head")) 
					{
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						return this.head;
					}
					
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					if (field.equals("hasNext")) 
					{
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "hasNext")) );
					}
					
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 265 "/usr/local/lib/haxe/std/List.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 265 "/usr/local/lib/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 265 "/usr/local/lib/haxe/std/List.hx"
		{
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			boolean __temp_executeDef1 = true;
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			switch (field.hashCode())
			{
				case 3377907:
				{
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					if (field.equals("next")) 
					{
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						return this.next();
					}
					
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					break;
				}
				
				
				case 696759469:
				{
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					if (field.equals("hasNext")) 
					{
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						__temp_executeDef1 = false;
						//line 265 "/usr/local/lib/haxe/std/List.hx"
						return this.hasNext();
					}
					
					//line 265 "/usr/local/lib/haxe/std/List.hx"
					break;
				}
				
				
			}
			
			//line 265 "/usr/local/lib/haxe/std/List.hx"
			if (__temp_executeDef1) 
			{
				//line 265 "/usr/local/lib/haxe/std/List.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 265 "/usr/local/lib/haxe/std/List.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 265 "/usr/local/lib/haxe/std/List.hx"
		baseArr.push("head");
		//line 265 "/usr/local/lib/haxe/std/List.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


