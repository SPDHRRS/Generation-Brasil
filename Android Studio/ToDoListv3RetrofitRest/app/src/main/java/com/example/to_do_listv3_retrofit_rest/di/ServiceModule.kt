package com.example.to_do_listv3_retrofit_rest.di

import com.example.to_do_listv3_retrofit_rest.Repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//O Objeto que armazenara as instancias dos objetos que criaremos
@Module // Indica que o Objeto armazenara os modulos
@InstallIn(SingletonComponent::class) //Indica que os Objetos criados aqui serao utilizados como Objetos SingleTon
object ServiceModule {

    @Provides //Indica que o metodo que criaremos retornara uma instancia de um Objeto
    @Singleton
    fun providesRepository(): Repository{
        return Repository()
    }
}