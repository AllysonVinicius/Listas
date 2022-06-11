package com.example.home.componentes
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.home.R
import de.hdodenhof.circleimageview.CircleImageView

class AlunoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var card: CardView = itemView.findViewById(R.id.alunoIcone)
    var imagem: CircleImageView = itemView.findViewById(R.id.alunoImagem)
    var nome: TextView = itemView.findViewById(R.id.alunoNome)
    var matricula: TextView = itemView.findViewById(R.id.alunoMatricula)}