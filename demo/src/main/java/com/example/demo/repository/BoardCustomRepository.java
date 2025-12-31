package com.example.demo.repository;


import com.example.demo.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BoardCustomRepository {
  /* type, keyword, pageable 주고 page<Board>를 리턴받고 싶음 */
  Page<Board> searchBoard(String type, String keyword, Pageable pageable);

}
