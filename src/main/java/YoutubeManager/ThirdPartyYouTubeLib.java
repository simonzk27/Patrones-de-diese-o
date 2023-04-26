
package YoutubeManager;

/**
 *
 * @author Simon alejandro Sanmiguel Ordoñez
 */
public interface ThirdPartyYouTubeLib {
    
    public void listVideos();
    
    public void getVideoInfo(ThirdPartyYouTubeLib id);
    
    public void downloadVideo(ThirdPartyYouTubeLib id);
           
}
