#jMusixMatch

A Java wrapper for the MusixMatch API

##How to use ?

* Declaring the MusixMatch Instance

		String apiKey = "Your MusixMatch API Key";
		MusixMatch musixMatch = new MusixMatch(apiKey);


* Fuzzy Search

		String trackName = "Don't stop the Party";
		String artistName = "The Black Eyed Peas";

		// Track Search [ Fuzzy ]
		Track track = musixMatch.getMatchingTrack(trackName, artistName);

		TrackData data = track.getTrack();

		System.out.println("AlbumID : "    + data.getAlbumId());
		System.out.println("Album Name : " + data.getAlbumName());
		System.out.println("Artist ID : "  + data.getArtistId());
		System.out.println("Album Name : " + data.getArtistName());
		System.out.println("Track ID : "   + data.getTrackId());


* Getting Lyrics

		// Getting Lyrics
		int trackID = data.getTrackId();

		Lyrics lyrics = musixMatch.getLyrics(trackID);

		System.out.println("Lyrics ID       : "     + lyrics.getLyricsId());
		System.out.println("Lyrics Language : "     + lyrics.getLyricsLang());
		System.out.println("Lyrics Body     : "     + lyrics.getLyricsBody());
		System.out.println("Script-Tracking-URL : " + lyrics.getScriptTrackingURL());
		System.out.println("Pixel-Tracking-URL : "  + lyrics.getPixelTrackingURL());
		System.out.println("Lyrics Copyright : "    + lyrics.getLyricsCopyright());



##Dependencies

* Google GSON (http://code.google.com/p/google-gson/)
* log4j (http://logging.apache.org/log4j/1.2/)