package crc6488302ad6e9e4df1a;


public class ImageLoaderCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.microsoft.maui.ImageLoaderCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onComplete:(Ljava/lang/Boolean;Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V:GetOnComplete_Ljava_lang_Boolean_Landroid_graphics_drawable_Drawable_Ljava_lang_Runnable_Handler:Microsoft.Maui.IImageLoaderCallbackInvoker, Microsoft.Maui\n" +
			"";
		mono.android.Runtime.register ("Microsoft.Maui.ImageLoaderCallback, Microsoft.Maui", ImageLoaderCallback.class, __md_methods);
	}


	public ImageLoaderCallback ()
	{
		super ();
		if (getClass () == ImageLoaderCallback.class)
			mono.android.TypeManager.Activate ("Microsoft.Maui.ImageLoaderCallback, Microsoft.Maui", "", this, new java.lang.Object[] {  });
	}


	public void onComplete (java.lang.Boolean p0, android.graphics.drawable.Drawable p1, java.lang.Runnable p2)
	{
		n_onComplete (p0, p1, p2);
	}

	private native void n_onComplete (java.lang.Boolean p0, android.graphics.drawable.Drawable p1, java.lang.Runnable p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
