package com.example.yaml.yamldemo.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@ActiveProfiles("dev")
@RunWith(SpringRunner.class)
@SpringBootTest
public class MciEnteriesDevTest {

    @Autowired
    MciRemoteEntities mciRemoteEntities;

    @Autowired
    MciRemoteMgr mciRemoteMgr;

    @Test
    public void test1() {
        List<MciRemote> list = mciRemoteEntities.getList();

        assertThat(list, is(notNullValue()));
        assertThat(list.size(), is(4));

        assertThat(list.get(0).getName(), is("DIS"));
        assertThat(list.get(0).getProtocol(), is("http"));
        assertThat(list.get(0).getAddress(), is("d-mciap"));
        assertThat(list.get(0).getPort(), is(10000));
        assertThat(list.get(0).getContext(), is("/context/example/dis"));

        assertThat(list.get(1).getName(), is("UBI"));
        assertThat(list.get(1).getProtocol(), is("http"));
        assertThat(list.get(1).getAddress(), is("d-mciap"));
        assertThat(list.get(1).getPort(), is(10001));
        assertThat(list.get(1).getContext(), is("/context/example/ubi"));

        assertThat(list.get(2).getName(), is("SMC"));
        assertThat(list.get(2).getProtocol(), is("http"));
        assertThat(list.get(2).getAddress(), is("d-mciap"));
        assertThat(list.get(2).getPort(), is(10002));
        assertThat(list.get(2).getContext(), is("/context/example/smc"));

        assertThat(list.get(3).getName(), is("PNP"));
        assertThat(list.get(3).getProtocol(), is("http"));
        assertThat(list.get(3).getAddress(), is("d-mciap"));
        assertThat(list.get(3).getPort(), is(10003));
        assertThat(list.get(3).getContext(), is("/context/example/pnp"));
    }

    @Test
    public void test2() {
        assertThat(mciRemoteMgr.getRemote("DIS").getName(), is("DIS"));
        assertThat(mciRemoteMgr.getRemote("DIS").getProtocol(), is("http"));
        assertThat(mciRemoteMgr.getRemote("DIS").getAddress(), is("d-mciap"));
        assertThat(mciRemoteMgr.getRemote("DIS").getPort(), is(10000));
        assertThat(mciRemoteMgr.getRemote("DIS").getContext(), is("/context/example/dis"));

        assertThat(mciRemoteMgr.getRemote("UBI").getName(), is("UBI"));
        assertThat(mciRemoteMgr.getRemote("UBI").getProtocol(), is("http"));
        assertThat(mciRemoteMgr.getRemote("UBI").getAddress(), is("d-mciap"));
        assertThat(mciRemoteMgr.getRemote("UBI").getPort(), is(10001));
        assertThat(mciRemoteMgr.getRemote("UBI").getContext(), is("/context/example/ubi"));

        assertThat(mciRemoteMgr.getRemote("SMC").getName(), is("SMC"));
        assertThat(mciRemoteMgr.getRemote("SMC").getProtocol(), is("http"));
        assertThat(mciRemoteMgr.getRemote("SMC").getAddress(), is("d-mciap"));
        assertThat(mciRemoteMgr.getRemote("SMC").getPort(), is(10002));
        assertThat(mciRemoteMgr.getRemote("SMC").getContext(), is("/context/example/smc"));

        assertThat(mciRemoteMgr.getRemote("PNP").getName(), is("PNP"));
        assertThat(mciRemoteMgr.getRemote("PNP").getProtocol(), is("http"));
        assertThat(mciRemoteMgr.getRemote("PNP").getAddress(), is("d-mciap"));
        assertThat(mciRemoteMgr.getRemote("PNP").getPort(), is(10003));
        assertThat(mciRemoteMgr.getRemote("PNP").getContext(), is("/context/example/pnp"));

        assertThat(mciRemoteMgr.getRemote(""), is(nullValue()));
        assertThat(mciRemoteMgr.getRemote("   "), is(nullValue()));
        assertThat(mciRemoteMgr.getRemote("AAA"), is(nullValue()));
        assertThat(mciRemoteMgr.getRemote("BBB"), is(nullValue()));
        assertThat(mciRemoteMgr.getRemote(null), is(nullValue()));
    }
}
