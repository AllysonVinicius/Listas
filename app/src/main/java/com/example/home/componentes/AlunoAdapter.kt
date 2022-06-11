package com.example.home.componentes
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.home.MainActivity
import com.example.home.R
import com.example.home.users.Aluno
import com.squareup.picasso.Picasso

class AlunoAdapter(
    var lalunos: List<Aluno>,
    val alunoView: MainActivity
): RecyclerView.Adapter<AlunoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false)

        return AlunoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        Picasso.get()
            .load(lalunos[position].imagemUrl)
            .placeholder(R.drawable.ic_launcher_background)
            .into(holder.imagem)

        holder.nome.text = lalunos[position].nome
        holder.matricula.text = lalunos[position].matricula

        holder.card.setOnClickListener {
            (alunoView as IOnClick).onClickAluno(lalunos[position])
            holder.card.setOnClickListener {
                (alunoView as IOnClick).onClickElement(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return lalunos.size
    }
}