package org.jmusixmatch;

import java.util.List;

import org.jmusixmatch.entity.lyrics.Lyrics;
import org.jmusixmatch.entity.track.Track;
import org.jmusixmatch.entity.track.TrackData;

public class Demo {

	public static void main(String[] args) throws MusixMatchException {

		String apiKey = "6b8dd7c17e1f1703e0ff159aa6431a9e";

		MusixMatch musixMatch = new MusixMatch(apiKey);

		String trackName = "Don't stop the Party";
		String artistName = "The Black Eyed Peas";

		// Track Search [ Fuzzy ]
		Track track = musixMatch.getMatchingTrack(trackName, artistName);

		TrackData data = track.getTrack();

		System.out.println("AlbumID : " + data.getAlbumId());
		System.out.println("Album Name : " + data.getAlbumName());
		System.out.println("Artist ID : " + data.getArtistId());
		System.out.println("Album Name : " + data.getArtistName());
		System.out.println("Track ID : " + data.getTrackId());

		// Getting Lyrics
		int trackID = data.getTrackId();

		Lyrics lyrics = musixMatch.getLyrics(trackID);

		System.out.println("Lyrics ID       : " + lyrics.getLyricsId());
		System.out.println("Lyrics Language : " + lyrics.getLyricsLang());
		System.out.println("Lyrics Body     : " + lyrics.getLyricsBody());
		System.out.println("Script-Tracking-URL : "
				+ lyrics.getScriptTrackingURL());
		System.out.println("Pixel-Tracking-URL : "
				+ lyrics.getPixelTrackingURL());
		System.out.println("Lyrics Copyright : " + lyrics.getLyricsCopyright());

		// Search Tracks
		List<Track> tracks = musixMatch.searchTracks("", "Eminem", "",
				10, 10, true);

		for (Track trk : tracks) {
			TrackData trkData = trk.getTrack();

			System.out.println("AlbumID : " + trkData.getAlbumId());
			System.out.println("Album Name : " + trkData.getAlbumName());
			System.out.println("Artist ID : " + trkData.getArtistId());
			System.out.println("Album Name : " + trkData.getArtistName());
			System.out.println("Track ID : " + trkData.getTrackId());
			System.out.println();
		}

	}
}
