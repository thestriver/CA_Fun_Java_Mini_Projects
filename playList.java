import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Get");
    desertIslandPlaylist.add("This");
    desertIslandPlaylist.add("Done");
    desertIslandPlaylist.add("With");
    desertIslandPlaylist.add("Already");
    System.out.println(desertIslandPlaylist);
 
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Get");
    desertIslandPlaylist.remove("With");
     System.out.println(desertIslandPlaylist);
    int a = desertIslandPlaylist.indexOf("This");
    int b = desertIslandPlaylist.indexOf("Already");
    
    
    desertIslandPlaylist.set(0, "Already");
    desertIslandPlaylist.set(2, "This");
    System.out.println(desertIslandPlaylist);
    
    
    
    
    
  }
  
}