//Import para o sistema de HashMap que será utilizado pro inventário
import java.util.HashMap;

public class Inventario {

    //Variáveis utilizadas dentro do inventário
    private int id; private String item;
    private HashMap<String,String> bolsa;

    public void Inventario(){

        HashMap<String, String> inv = new HashMap<String, String>();

    }

    //Método que vai retornar todos os itens no inventário
    public HashMap<String, String> getBolsa() {
         return bolsa;
    }

    //Método que vai adicionar itens no inventário
    public void addInv(String id, String item) {
        bolsa.put(item, id);
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setBolsa(HashMap<String, String> bolsa) {
        this.bolsa = bolsa;
    }

}