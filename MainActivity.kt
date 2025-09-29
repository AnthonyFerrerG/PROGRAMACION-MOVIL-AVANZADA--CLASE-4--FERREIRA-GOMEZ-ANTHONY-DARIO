fun mostrarTexto(view: View) {
    val etTexto = findViewById<EditText>(R.id.etTexto)
    val tvResultado = findViewById<TextView>(R.id.tvResultado)
    tvResultado.text = etTexto.text.toString()
}

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val etTexto = findViewById<EditText>(R.id.etTexto)
    val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)
    val tvResultado = findViewById<TextView>(R.id.tvResultado)

    btnConfirmar.setOnClickListener {
        tvResultado.text = etTexto.text.toString()
    }
}
