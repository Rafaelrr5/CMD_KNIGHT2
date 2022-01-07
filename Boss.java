public interface Boss{
    
    //Interface de inimigos chefes que terão esses métodos como padrões
    public int ataque(int ataquebase, int atkspeed);

    public void regeneracao(double vida);

}
