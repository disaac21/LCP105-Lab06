package lab6p2_danieljuarez;

import java.util.ArrayList;

public class Casa {
    
    public String TamañoCasa;
    public int CostoCasa;
    public int CooXCasa;
    public int CooYCasa;
    public ArrayList <Puffle> PufflesCasa;

    public Casa() {
    }
    
    public Casa(String TamañoCasa, int CostoCasa, int CooXCasa, int CooYCasa, ArrayList<Puffle> PufflesCasa) {
        this.TamañoCasa = TamañoCasa;
        this.CostoCasa = CostoCasa;
        this.CooXCasa = CooXCasa;
        this.CooYCasa = CooYCasa;
        this.PufflesCasa = PufflesCasa;
    }

    public String getTamañoCasa() {
        return TamañoCasa;
    }

    public void setTamañoCasa(String TamañoCasa) {
        this.TamañoCasa = TamañoCasa;
    }

    public int getCostoCasa() {
        return CostoCasa;
    }

    public void setCostoCasa(int CostoCasa) {
        this.CostoCasa = CostoCasa;
    }

    public int getCooXCasa() {
        return CooXCasa;
    }

    public void setCooXCasa(int CooXCasa) {
        this.CooXCasa = CooXCasa;
    }

    public int getCooYCasa() {
        return CooYCasa;
    }

    public void setCooYCasa(int CooYCasa) {
        this.CooYCasa = CooYCasa;
    }

    public ArrayList<Puffle> getPufflesCasa() {
        return PufflesCasa;
    }

    public void setPufflesCasa(ArrayList<Puffle> PufflesCasa) {
        this.PufflesCasa = PufflesCasa;
    }

    @Override
    public String toString() {
        return "Casa Tamanio: " + TamañoCasa + "& Costo: " + CostoCasa + "\n";
    }
    
    
    
}
