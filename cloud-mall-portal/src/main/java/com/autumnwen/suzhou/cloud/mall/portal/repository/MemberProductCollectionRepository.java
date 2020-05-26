package com.autumnwen.suzhou.cloud.mall.portal.repository;

import com.autumnwen.suzhou.cloud.mall.portal.domain.MemberProductCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 商品收藏Repository
 * Created by macro on 2018/8/2.
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection,String> {
    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);
    int deleteByMemberIdAndProductId(Long memberId,Long productId);
    List<MemberProductCollection> findByMemberId(Long memberId);
}
