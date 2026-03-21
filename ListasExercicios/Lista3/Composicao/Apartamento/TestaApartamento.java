public class TestaApartamento {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Sky", "Rua Saldanha Marinho, 2411");

        edificio.construirApartamento(2101, 21);
        edificio.construirApartamento(2102, 21);
        edificio.construirApartamento(2203, 22);

        edificio.listarApartamentos();
    }
}
