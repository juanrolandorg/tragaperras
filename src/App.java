public class App {
    public static void main(String[] args) throws Exception {
        // ejercicio 3 y cosecha propia: tragaperras
        String limon = "\uD83C\uDF4B"; // 🍋
        String trebol = "\uD83C\uDF40"; // 🍀
        String piña = "\uD83C\uDF4D"; // 🍍
        String cereza = "\uD83C\uDF52"; // 🍒

        System.out.println("--------------------------------");
        // para poder crear una tragaperras, voy a necesitar los simbolos
        System.out.println("Los símbolos en la máquina son");
        System.out.println(limon); 
        System.out.println(trebol); 
        System.out.println("7"); 
        System.out.println(piña); 
        System.out.println(cereza); 
        System.out.println("--------------------------------");

        // ya tengo los simbolos ahora tengo que hacer que aleatoriamente se asignen
        // valores
        // necesito crear tres rodillos idependientes, una tabla de pagos (en vdd
        // opcional) y un motor aleatorio (que me esta jodienmdo la vida)
        // Para dar semscaion de aleatoriedad puedo hacerlo asi:
        boolean jugar = true;
        // inicio bucle principal
        do {
            int rodillo1 = (int) ((Math.random() * 40) + 1);
            int rodillo2 = (int) ((Math.random() * 40) + 1);
            int rodillo3 = (int) ((Math.random() * 40) + 1);
            String icono1 = "";
            String icono2 = "";
            String icono3 = "";
            // rodillo 1 valores
            if (rodillo1 <= 10) {
                icono1 = limon;
            } else if (rodillo1 <= 20) {
                icono1 = trebol;
            } else if (rodillo1 <= 30) {
                icono1 = "7";
            } else if (rodillo1 <= 40) {
                icono1 = piña;
            } else {
                icono1 = cereza;
            }
            // rodillo 2 valores
            if (rodillo2 <= 10) {
                icono2 = limon;
            } else if (rodillo2 <= 20) {
                icono2 = trebol;
            } else if (rodillo2 <= 30) {
                icono2 = "7"; // 7
            } else if (rodillo2 <= 40) {
                icono2 = piña;
            } else {
                icono2 = cereza;
            }
            // rodillo 3 valores
            if (rodillo3 <= 10) {
                icono3 = limon;
            } else if (rodillo3 <= 20) {
                icono3 = trebol;
            } else if (rodillo3 <= 30) {
                icono3 = "7"; // 7
            } else if (rodillo3 <= 40) {
                icono3 = piña;
            } else {
                icono3 = cereza;
            }
            // muestro resultados
            System.out.println("GAMBLEANDOOO:");
            System.out.println("----------------");
            System.out.println("| " + icono1 + " | " + icono2 + " | " + icono3 + " |");
            System.out.println("----------------");
            // compruebo si ha ganado
            if (icono1.equals("7") && icono2.equals("7") && icono3.equals("7")) {
                System.out.println("¡Jackpot! ¡Has sacado tres 7!");
            } else if (icono1.equals(icono2) && icono2.equals(icono3)) {
                System.out.println("¡Enhorabuena! ¡Has ganado!");
            } else {
                System.out.println("Lo siento, has perdido. ¡Inténtalo de nuevo!");
            }
            System.out.print("""
                    ¿Quieres jugar otra vez?:
                    Sí: pulse 0
                    No: pulse 1
                            """);
            if (System.console().readLine().equals("1")) {
                jugar = false;
                System.out.println("Gracias por jugar. ¡Hasta la próxima!");
            }
            System.out.println("--------------------------------");
            System.out.println("--------------------------------");

        } while (jugar);
    }
}
