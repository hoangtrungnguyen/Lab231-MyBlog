package com.example.labmyblog.repository

import com.example.labmyblog.model.Blog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface BlogRepository : JpaRepository<Blog, Long> {
//    override fun findPaginatedUsers(name: String, pageable: Pageable): Page<Blog>? {
//        val pageSize: Int = pageable.getPageSize()
//        val currentPage: Int = pageable.getPageNumber()
//        val startRow = currentPage * pageSize
//        val query = "SELECT * FROM users WHERE name LIKE ? ORDER BY id LIMIT ?,?"
//        val users: List<Blog> =
//            jdbcTemplate.query(query, arrayOf<Any>("%$name%", startRow, pageSize), UserRowMapper())
//        val totalUsers: Int = jdbcTemplate.queryForObject(
//            "SELECT count(*) FROM users WHERE name LIKE ?", arrayOf<Any>(
//                "%$name%"
//            ),
//            Int::class.java
//        )
//        return PageImpl<T>(users, pageable, totalUsers.toLong())
//    }
}
