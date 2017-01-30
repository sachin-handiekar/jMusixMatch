package org.jmusixmatch;

import org.jmusixmatch.entity.lyrics.Lyrics;
import org.jmusixmatch.entity.track.Track;
import org.jmusixmatch.entity.track.TrackData;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class MusixMatchAPITest {


    @Test
    @Ignore
    public void testAPI() throws MusixMatchException {


        String apiKey = "--Your API Key--";
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


        int trackID = data.getTrackId();

        Lyrics lyrics = musixMatch.getLyrics(trackID);

        System.out.println("Lyrics ID       : " + lyrics.getLyricsId());
        System.out.println("Lyrics Language : " + lyrics.getLyricsLang());
        System.out.println("Lyrics Body     : " + lyrics.getLyricsBody());
        System.out.println("Script-Tracking-URL : " + lyrics.getScriptTrackingURL());
        System.out.println("Pixel-Tracking-URL : " + lyrics.getPixelTrackingURL());
        System.out.println("Lyrics Copyright : " + lyrics.getLyricsCopyright());


        // The following will search for tracks with matching artist_name 'Eminem'
        List<Track> tracks = musixMatch.searchTracks("", "Eminem", "", 10, 10, true);

        for (Track trk : tracks) {
            TrackData trkData = trk.getTrack();

            System.out.println("AlbumID : " + trkData.getAlbumId());
            System.out.println("Album Name : " + trkData.getAlbumName());
            System.out.println("Artist ID : " + trkData.getArtistId());
            System.out.println("Artist Name : " + trkData.getArtistName());
            System.out.println("Track ID : " + trkData.getTrackId());
            System.out.println();
        }

    }
}
