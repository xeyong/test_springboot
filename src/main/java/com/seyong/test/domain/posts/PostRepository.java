package com.seyong.test.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> {
//와 ㅅㅂ 기본 crud 자연스럽게 생성됨 단, Entity 클래스랑 기본 JPA Repository는 같은 패키지에있어야됨

}
