package com.zachwang.ybbdfyoo;

import com.alibaba.fastjson.JSONObject;
import com.zachwang.ybbdfyoo.utility.Constants;
import com.zachwang.ybbdfyoo.utility.DateUtil;
import com.zachwang.ybbdfyoo.utility.SignatureUtil;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YbbdfyooApplicationTests {
  private static final Logger LOG = LoggerFactory.getLogger(YbbdfyooApplicationTests.class);

  @Test
  public void contextLoads() {
  }

  /**
   * 测试签名生成.
   */
  public void signatureUtilTest01() {
    String value = "{\"apiKey\":[\"234\",\"2345\"],\"data\":{\"productNewLineTypeId\":9,"
        + "\"departCityName\":\"北京\",\"destGroupId\":19,\"productId\":\"210134278\","
        + "\"start\":\"0\",\"limit\":\"5\",\"classBrandId\":0,\"departCityCode\":200},"
        + "\"sign\":\"199659D63DEC9705B50DB9136476ABDB\",\"timestamp\":\"2018-10-1818:21:20\"}";
    JSONObject jsonObject = JSONObject.parseObject(value);
    String signature = SignatureUtil.getSignature(jsonObject, "aaaaaaaa");
    LOG.debug(signature);
  }

  @Test
  public void dateUtilTest01() {
    LOG.info(DateUtil.getCurrentTimeStr(Constants.FORMAT_YYYY_MM_DD_HH_MM_SS));
  }

  @Test
  public void dateUtilTest02() {
    LOG.info(DateUtil.getFirstDayOfMonth(2018, 1).toString());
  }

  @Test
  public void dateUtilTest03() {
    LOG.info(DateUtil.getOffSetMillisecond(new Date(), 1).toString());
  }
}
