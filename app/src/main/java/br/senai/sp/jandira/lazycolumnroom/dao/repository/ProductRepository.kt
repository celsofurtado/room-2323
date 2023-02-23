package br.senai.sp.jandira.lazycolumnroom.dao.repository

import android.content.Context
import br.senai.sp.jandira.lazycolumnroom.dao.ProductDb
import br.senai.sp.jandira.lazycolumnroom.model.Product

class ProductRepository(context: Context) {

    private val db = ProductDb.getDatabase(context)

    fun getProductsList(): List<Product> {
        return db.productDao().getAll()
    }

    fun save(product: Product): Long {
        return db.productDao().save(product)
    }

}