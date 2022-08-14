package poo

interface Banco {
    fun sacar(valor: Double): Boolean
    fun depositar(valor: Double): Boolean
    fun transferir(valor: Double, destino: Banco): Boolean
}

interface Seguranca {
    fun verificarSenha(senha: String): Boolean
    fun alterarSenha(senha: String): Boolean
    fun checarSenha(senha: String): Boolean
}

class UniBank : Banco, Seguranca {
  override fun sacar(valor: Double): Boolean {
    TODO("Not yet implemented")
  }

  override fun depositar(valor: Double): Boolean {
    TODO("Not yet implemented")
  }

  override fun transferir(valor: Double, destino: Banco): Boolean {
    TODO("Not yet implemented")
  }

  override fun verificarSenha(senha: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun alterarSenha(senha: String): Boolean {
    TODO("Not yet implemented")
  }

  override fun checarSenha(senha: String): Boolean {
    TODO("Not yet implemented")
  }
}