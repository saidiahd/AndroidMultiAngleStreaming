package com.google.android.farouk.video;

import java.util.Map;

import android.content.Context;
import android.net.Uri;
import android.widget.VideoView;


     /** <p>Displays a video file. The {@link VideoMultiView} class can load video content  
      * from various sources (such as resources or content providers), 
      * takes care of computing its measurement from the video so that it can be
      *  used in any layout manager, and provides various display options such as
      *   scaling and tinting.<p>
     **/

public class VideoMultiView extends VideoView {
	
	  // the video URIs list, which the user which can switch between 
	  // them
	private Uri[] mURIs;

	public VideoMultiView(Context context) {
		super(context);
	}
	
	public void setVideoURIs(Uri[]uri, Map<String, String>headers){
		  mURIs = uri;
		  
	}

	
}
