import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class PilotoAnidado extends PilotoBase
{
    public void mision13(NaveDeAtaque nave){
        boolean estaEnBaseAzul = !nave.hayVacioHacia(Direccion.NORTE);
        nave.encenderMotores();
        if (estaEnBaseAzul){
            nave.avanzarHacia (Direccion.SUR);
            nave.darVuelta(Direccion.NORTE);
            nave.darVuelta(Direccion.NORTE);
        }
    }

    public void mision14(NaveDeAtaque nave){
        nave.encenderMotores();
        for (int i = 0; i < 2; i++) {
            nave.avanzarHacia(Direccion.NORTE);
        }
        for (int i = 0; i < 4; i++) {
            nave.avanzarHacia(Direccion.SUR);
        }
        for (int i = 0; i < 2; i++) {
            nave.avanzarHacia(Direccion.NORTE);
        }
    }

    public void mision15(NaveDeAtaque nave, Direccion direccion){
        nave.encenderMotores();
        while (nave.obtenerCombustible() > nave.obtenerConsumoPorMovimiento()){
            if (nave.hayVacioHacia(direccion)){
                direccion = direccion.girarALaIzquierda();
            } else if (nave.hayNaveHacia(direccion) || nave.hayAsteroideHacia(direccion)){
                nave.atacarHacia(direccion);
            }
            nave.avanzarHacia(direccion);
        }
        nave.apagarMotores();
    }
}

