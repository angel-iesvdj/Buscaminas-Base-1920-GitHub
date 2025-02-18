import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que implementa el listener de los botones del Buscaminas.
 * De alguna manera tendrá que poder acceder a la ventana principal.
 * Se puede lograr pasando en el constructor la referencia a la ventana.
 * Recuerda que desde la ventana, se puede acceder a la variable de tipo ControlJuego
 * @author jesusredondogarcia
 **
 */
public class ActionBoton implements ActionListener{

	VentanaPrincipal ventana;
	int i;
	int j;

	public ActionBoton(VentanaPrincipal ventana, int i, int j) {
		this.ventana=ventana;
		this.i=i;
		this.j=j;
	}
	
	/**
	 *Acción que ocurrirá cuando pulsamos uno de los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(ventana.juego.abrirCasilla(i, j)==false) {
			ventana.mostrarFinJuego(true);
		}else {
			ventana.mostrarNumMinasAlrededor(i, j);
			if(ventana.juego.esFinJuego()) {
				ventana.mostrarFinJuego(false);
			}
		}
	}
}