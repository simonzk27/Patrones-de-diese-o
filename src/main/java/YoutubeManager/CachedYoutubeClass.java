
package YoutubeManager;

/**
 *
 * @author Simon alejandro Sanmiguel Ordoñez
 */
public abstract class CachedYoutubeClass implements ThirdPartyYouTubeLib{
    
    private ThirdPartyYouTubeLib service;
       
    public ThirdPartyYouTubeLib CachedYouTubeClass(ThirdPartyYouTubeLib s){
    return s;
}
  
    @Override
    public void listVideos() {
        
     }

    @Override
    public void getVideoInfo(ThirdPartyYouTubeLib id) {
       
    }

    @Override
    public void downloadVideo(ThirdPartyYouTubeLib id) {
        
    }
    
}
