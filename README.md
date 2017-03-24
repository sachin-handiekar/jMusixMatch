# jMusixMatch [![Build Status](https://travis-ci.org/sachin-handiekar/jMusixMatch.png?branch=master)](https://travis-ci.org/sachin-handiekar/jMusixMatch) [![Maven Central](https://img.shields.io/maven-central/v/com.sachinhandiekar/jMusixMatch.svg)](https://img.shields.io/maven-central/v/com.sachinhandiekar/jMusixMatch.svg)

A Java wrapper for the [MusixMatch API](https://developer.musixmatch.com/)

##Maven

```xml
<dependency>
  <groupId>com.sachinhandiekar</groupId>
  <artifactId>jMusixMatch</artifactId>
  <version>1.1.4</version>
</dependency>
```

If you prefer using the latest snapshot build, include the following lines to your pom.xml.
	
```xml
    <repositories>
        <repository>
            <id>oss.snapshots</id>
            <name>OSS Sonatype Snapshot Repository</name>
            <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
            <releases>
                <enabled>false</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.sachinhandiekar</groupId>
            <artifactId>jMusixMatch</artifactId>
             <version>1.1.5-SNAPSHOT</version>
        </dependency>
    </dependencies>
```

##How to use ?

* Declaring the MusixMatch Instance

```java
String apiKey = "Your MusixMatch API Key";
MusixMatch musixMatch = new MusixMatch(apiKey);
```

* Fuzzy Search

```java
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
```

* Getting Lyrics

```java
int trackID = data.getTrackId();

Lyrics lyrics = musixMatch.getLyrics(trackID);

System.out.println("Lyrics ID       : "     + lyrics.getLyricsId());
System.out.println("Lyrics Language : "     + lyrics.getLyricsLang());
System.out.println("Lyrics Body     : "     + lyrics.getLyricsBody());
System.out.println("Script-Tracking-URL : " + lyrics.getScriptTrackingURL());
System.out.println("Pixel-Tracking-URL : "  + lyrics.getPixelTrackingURL());
System.out.println("Lyrics Copyright : "    + lyrics.getLyricsCopyright());
```

* Search Tracks

```java
// The following will search for tracks with matching artist_name 'Eminem'
List<Track> tracks = musixMatch.searchTracks("", "Eminem", "", 10, 10, true);

for (Track trk : tracks) {
    TrackData trkData = trk.getTrack();
 
    System.out.println("AlbumID : "     + trkData.getAlbumId());
    System.out.println("Album Name : "  + trkData.getAlbumName());
    System.out.println("Artist ID : "   + trkData.getArtistId());
    System.out.println("Artist Name : " + trkData.getArtistName());
    System.out.println("Track ID : "    + trkData.getTrackId());
    System.out.println();
}
```

##Dependencies

* Google GSON (http://code.google.com/p/google-gson/)

##About me

* [LinkedIn](http://uk.linkedin.com/in/sachinhandiekar)
* Email   : sachin.handiekar at gmail.com / sach21 at gmail.com
* Twitter : [@sachinhandiekar](http://twitter.com/sachinhandiekar)
