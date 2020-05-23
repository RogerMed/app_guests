package com.example.convidados.service.repository

import android.content.Context
import com.example.convidados.service.model.GuestModel

class GuestRepository(context: Context) {

    //Acessa banco de dados
    private val mDataBase = GuestDataBase.getDatabase(context).guestDAO()

    /**
     *Carrega convidado
     */
    fun get(id: Int): GuestModel {
        return mDataBase.get(id)
    }

    /**
     *Insere convidado
     */
    fun save(guest: GuestModel): Boolean {
        return mDataBase.save(guest) > 0
    }

    /**
     *Faz a listagem de todos convidados
     */
    fun getAll(): List<GuestModel> {
        return mDataBase.getInvited()
    }

    /**
     *Faz a listagem de todos convidados presentes
     */
    fun getPresent(): List<GuestModel> {
        return mDataBase.getPresent()
    }

    /**
     *Faz a listagem de todos convidados ausentes
     */
    fun getAbsent(): List<GuestModel> {
        return mDataBase.getAbsent()
    }

    /**
     *Faz a atualização do convidado
     */
    fun update(guest: GuestModel): Boolean {
        return mDataBase.update(guest) > 0
    }

    /**
     *Remove o  convidado
     */
    fun delete(guest: GuestModel){
        mDataBase.delete(guest)
    }


}