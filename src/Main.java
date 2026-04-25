//TIP Para <b>ejecutar</b> el código, presiona <shortcut actionId="Run"/> o
// haga clic en el icono <icon src="AllIcons.Actions.Execute"/> del margen.
public class Main {
    public static void main(String[] args) {
        //TIP Pulse <shortcut actionId="ShowIntentionActions"/> con el cursor sobre el texto resaltado
        // para ver cómo IntelliJ IDEA sugiere corregirlo.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Presione <shortcut actionId="Debug"/> para comenzar a depurar su código. Hemos establecido un punto de interrupción <icon src="AllIcons.Debugger.Db_set_breakpoint"/>.
            // para ti, pero siempre puedes añadir más pulsando <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}