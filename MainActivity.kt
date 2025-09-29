fun mostrarTexto(view: View) {
    val etTexto = findViewById<EditText>(R.id.etTexto)
    val tvResultado = findViewById<TextView>(R.id.tvResultado)
    tvResultado.text = etTexto.text.toString()
}
