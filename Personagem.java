public class Personagem {
    
    //Variáveis utilizadas em todos os personagens criados
    private int nvl,ouro,vidatotal,atktotal,deftotal,atkspeedtotal;
    private String nome;      

    //Constante de desconto que será utilizada para diminuir o preço de compras em lojas
    public static final int desconto = 10; 
    
    //Criação de personagem guerreiro
    protected Personagem(int espada){

        Guerreiro userg = new Guerreiro();
        Inventario inv = new Inventario();

        this.nvl = 1; this.ouro = 10; this.vidatotal = userg.getVida();
        this.atktotal = userg.getAtk() + userg.getDanoEsp(); this.deftotal = userg.getDef();
        this.atkspeedtotal = userg.getAtkspeedesp();
        
    }

    //Criação de personagem arqueiro
    protected Personagem(int arco, int flecha){

        Arqueiro usera = new Arqueiro();
        Inventario inv = new Inventario();

        this.nvl = 1; this.ouro = 10; this.vidatotal = usera.getVida();
        this.atktotal = usera.getAtk() + usera.getDanoArco();
        
    }

    public void addInv(String id, String item){

    }

    public void verItem(String id){
        
    }

    public int getNvl() {
        return nvl;
    }

    public void setNvl(int nvl) {
        this.nvl = nvl;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public int getVidatotal() {
        return vidatotal;
    }

    public void setVidatotal(int vidatotal) {
        this.vidatotal = vidatotal;
    }

    public int getAtktotal() {
        return atktotal;
    }

    public void setAtktotal(int atktotal) {
        this.atktotal = atktotal;
    }

    public int getDeftotal() {
        return deftotal;
    }

    public void setDeftotal(int deftotal) {
        this.deftotal = deftotal;
    }

    public int getAtkspeedtotal() {
        return atkspeedtotal;
    }

    public void setAtkspeedtotal(int atkspeedtotal) {
        this.atkspeedtotal = atkspeedtotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
