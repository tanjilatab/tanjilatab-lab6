public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO: should rotate one click counterwise & change String || should return true when the rotor's current character matches its starting character, false otherwise



               
    }
    

    public int indexOf(char c){
        //TODO: returns index in String at which a guven character appears
        return rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        //TODO: return character at a given index
        return rotorValues.charAt(idx);
    }
}
    
