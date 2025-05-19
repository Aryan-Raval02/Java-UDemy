public class typeOfWebsite {
    public static void main(String[] args) {
        website("http://www.google.com");
    }

    public static void website(String url){
        int p = url.indexOf(":");
        String protocol = url.substring(0,p);

        for(int i=url.length()-1;i>=0;i--){
            if(url.charAt(i) == '.'){
                p = i;
                break;
            }
        }
        String type = url.substring(p+1);
            
        if(type.equals("com")){ type = "Commercial"; }
        if(type.equals("org")) type = "Organization";
        if(type.equals("gov")) type = "Government";
        if(type.equals("mil")) type = "Militry";

        if(protocol.equals("http")) protocol = "Hyper Text Trasfer Protocol";
        if(protocol.equals("https")) protocol = "Hyper Text Trasfer Protocol Secure";
        if(protocol.equals("ftp")) protocol = "File Trasfer Protocol";

        System.out.println("Protocol : "+protocol+"\nType of Website : "+type);
    }
}
