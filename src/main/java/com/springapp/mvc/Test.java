package com.springapp.mvc;


import javafx.scene.effect.SepiaTone;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;

/**
 * Created by Administrator on 2016/4/27.
 */
public class Test {


    public static void main(String[] args) throws InterruptedException {
//        for (int i=0;i<5;i++) {
//            final int finalI = i;
//            Thread t = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    threadLocal.set(finalI +"");
//                    System.out.println(Thread.currentThread().getName() + ".." + threadLocal.get());
//                }
//            }, i + "-thread");
//            t.start();
////            System.out.println(Thread.currentThread().getName() + ".." + threadLocal.get());
//        }
//
//        AtomicInteger integer = new AtomicInteger();
//        integer.getAndAdd(1273);
//        System.out.println(integer);
//        ConcurrentHashMap map = new ConcurrentHashMap();
//        map.put("key","value");
//        System.out.println(map.get("key"));
//
//        Condition condition = new ReentrantLock().newCondition();
//        String result = null;
//        Future future = new FutureTask(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("ss");
//            }
//        }, result);
//        Integer a = 1;
//        Integer b = 2;
//        Integer c = 3;
//        Integer d = 3;
//        Integer e = 321;
//        Integer f = 321;
//        Long g = 3L;
//
//        System.out.println(c == d);
//        System.out.println(e == f);
//        System.out.println(c == (a + b));
//        System.out.println(c.equals(a + b));
//        System.out.println(g == (a + b));
//        System.out.println(g.equals(a + b));
//        System.out.println(d.equals(c));
//        String aa= "hello";
//        String bb = "hello";
//        String cc = new String("hello");
//        System.out.println(aa == bb);
//        System.out.println(aa == cc);
//        ll("s","s","k");
//        final String s= "s";
//        String ab = s;
//        System.out.println(null == null);
//        StringBuilder sb =new StringBuilder();
//        sb.append(1).append(2).append(3);

//
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("t1...");
//            }
//        });
//        t.start();
//        try {
//            t.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("main..");

//        Person
//        String s = "好评 给我罗汉哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈好好好哈哈哈哈哈哈哈哈h?b本人懒，但觉得改手游真好玩垃圾游戏，官方胡乱扣取玩家摆摊所得游戏金币，种种霸王条款，客服都是电脑答复形同摆设！上诉问题久久得不到解决！谢谢游戏 让我找到我的最爱更新后总是闪退和掉线，掉线后就上不来，赶紧解决哈哈哈哈哈我从来不玩手游，这次是诗诗代言的才玩的，不为了玩，为了诗诗。梦幻手游wi fi登录不了用数据就可以  明明前一天好好的 第二天Wi-Fi就登陆不上去了 数据就可以登 我还远手机 从新下载还是不行 怎么回事 更新完就这样了 什么破游戏啊从端游到手游，从学生时代到现在，好多年了满满的回忆这游戏挺好玩的，能够认识许多朋友。非常好玩的游戏 好评好垃圾的游戏啊。手机发热垃圾网易 随便扣老子金 忘早日倒闭还是熟悉的配方，还是熟悉的味道！好玩  在哪里都可以玩  一机在手 走到哪都能玩梦幻西游真好玩。我要充钱。手动滑稽55555555555555555555555还行赶紧修复！！！！！很好玩的游戏回归之后洗宝宝好牛掰还可以，没事做的时候玩玩还不错真找到点儿时梦幻的感觉挺好很好玩！非常棒！很好很好，不知不觉就到了十六个字。可玩性强！还可以，继续努力吧国产良心手游我现在开始发现我已经成为网易的脑残粉了，梦幻手游一出我就开始玩，虽然有点坑钱，但是很多平民不花钱也照样玩的开心。还是那一句“爱生活，爱梦幻西游”挺好的一个游戏，就是真的太花钱了，希望给平民玩家多一些可玩性很不错啦 刚刚洗出5技能鬼就来评论啦合宝宝顺利！怀念的经典，移动佳作!很好经常闪退，有时候声音会变卡，背景音乐突然加速还有那种模糊的类似收音机信号不好的声音，求优化玩的还行。当是娱乐吧。挺好的。最强的手游好玩只不过稀有物品不好爆，希望我能多爆一些稀有物品你的时候了、一起玩具车辆在一起了？我是有点不要钱夹韩版修身男士休闲裤。我们都市全部的话。我们都市的话可以理解的确很好很久了。我们都市全部都是不是也许我们会有那么一定要是最后一个月的时间都没有了你说的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多人生哲理的确是不是很多，我的小伙伴们都会有些不会再也没有什么事都会有些不会再也没有什么事都会有些不会再也没有什么事都会有些洗宠好难 我想要变异宠-.-刚练级到45带 瑞兽，买了个野生瑞兽只用了七、八个金流露就洗出个满技能！不错不错！！爱生活爱梦幻挺好玩的啦啦啦啦啦啦不错的游戏 上手快 GM叔叔多给点奖励出个变异吧。玩了几个月了，不玩有点舍不得这个游戏！爱思考思考开始看世界渐入佳境夫妇内地弟弟看到裤子梦幻西游给了我儿时的回忆，给了我如今的快乐很好里面好多东西交易不方便，尤其是想卖号或者买号的玩家！这游戏托真的多。无语将近10年前玩的电脑版，手游版也很不错，这是情怀啊内容丰富玩的还挺嗨、爱生活、爱梦幻！玩了一年多了，已经是一种习惯了，打发时间还是不错的！我爱你1314，梦幻西游很喜欢玩太完美了我希望可以出RMB交易系统和一对一交易系统。否则玩家们的付出与回报差距甚大，使大部分手游玩家对长期投入热情变淡导致弃游。这游戏很喜欢，虽然是第一次玩不错法国航空的俄国和警察从风风光光给广告费丰富的点点滴滴形形色色的这是本人目前为止感觉最好的一款手游，自主性很大，高低距离差异不是很大，讲究合作，战略。很棒的一款游戏很好坑人人都玩，不玩才怪太好了了了一个小时候后者的人了、一个人生阶段都在用自己人扣金币 无缘无故有惊有喜，蛮刺激。希望运气连连。大爱这个游戏，赞赞赞如果左下角，能增加个，当前语音对话就好了，游戏挺好的好玩是好玩就是有点坑 想玩好要充钱 快出子女系统吧都出了一年多了 效率宝宝保底漂亮！！！！！！！！！玩了十年了游戏不错   就是太坑钱了国产网游厂商的眼里只有钱，垃圾游戏，真心祝各位早日脱坑。关爱身心健康，远离国产游戏。不是不支持，而是国产游戏确实垃圾。希望广大游戏爱好者能把眼光放长远，不要沉迷于垃圾国产了游戏了，你会越陷越深的，等到后悔，为时已晚。为什么用WiFi链接老掉线重连，用4G就不会。我的WiFi网速测试10兆看电影下载都没问题就是玩梦幻卡卡卡玩了十几年的游戏，很适合做成手游，特别棒，希望越做越好，早开手游新门派能用的特技只能洗？非常好玩！回忆了童年！追了梦幻很久了还不错梦幻就是个坑钱游戏 时不时就以各种理由扣你金币还不返还  建议大家不要玩  见过最坑爹的游戏游戏还是挺好玩的，就是脸好黑，打装备合宠打书都黑，心塞。求转运～交易金币老是被扣，限制交易还可以好玩找在合肥的玩家有的联系我电话15056053319，81级DT门派，号投入了3万多，有半年没有玩了，宝宝装备全部有放着怪可惜的，免费送你玩了，必须要是合肥人。耗电，发热越来越是个问题了很好玩画面很美么么么么么么么么么么么么么么么么么么么么么么么么哒音效动作武器太单调。玩了很久了、很喜欢求网易对我好点。手游有什么意思，费电不说，一个劲的划拉屏幕，逗比令人怀念坑货很不错的游戏，第一次玩手游就玩这个，玩一年多了 挺不错的！平民玩家玩不起啊。游戏里面奖励我感觉运气不好。还有福神就是一个坑神，赚到就收吧...从读书就开始玩，现在还在玩！谁能告诉下会不会出转区游戏讲真挺不错，但有一点极其坑：占用内存会越来越大！！！！！！\n" +
//                "越玩越占内存，本来400M＋最后变成了1.5G+，虽然显示的仍然是400多，不信的可以重新创建个角色玩一会，你会发现剩余内存变少了叫啊叫的肌肤难道就是没什么好玩，希望以后好运来，多出珍品真心不错整体还不错 就是升级太慢。娱乐活动太少 每天做完活动任务就不知道做什么了。只有捉鬼封妖了非常好玩挺好玩的，有意思大爱。很经典，游戏画面也非常好，希望网易越办越好。好玩jjjiiikkkkkkkkkkkkkkklnhggghjnmmkoo哈哈，就喜欢回合制游戏如题 这次更新后进不去常玩的那个服务器 其他服务器都可以进！不错好好好非常好玩儿，一天两个小时，你就不想放手。好玩多给我来点珍品装备吧好玩，真心好玩，玩了就知道。希望开箱子开高神，打装备出特技好垃圾游戏非常喜欢的一款手游...很喜欢人气爆满、真心好玩.不错游戏 和端游越来越接近！副本 人物变化越来越多！支持走下去，也希望自己运气更好一点！娱乐而已。特么一个手游，把自己虐到不要不要的。认真你就输了，以后不会再碰梦幻。优秀的游戏大家一起玩啊加油梦幻 好运给我哦好难我玩梦幻很多年，就是我脸很黑，值得大家来玩非常好真的值得怀念。也可以要不要这样，几十个66才练出一个珍品，成功率能提高一点吗为什么活动有安卓没有苹果？更别提芒果了....你这么扯淡你家里人知道吗？移动端那么难么？以前的梦幻也就几百兆，那样也很好！特别喜欢梦幻西游！很喜欢梦幻西游爱生活、更爱梦幻西游。祝愿网易团队越做越好。越做越强。加油，愿以后的生活能一直有你陪伴，都说一梦十年。我已经一梦十二年。我是群星璀璨的69大唐苏风。我在群星璀璨等你们。祝大家事事顺利！！加油比神武差多了……好玩不知不觉玩了有两个月了 、 发现我慢慢爱上了这款游戏。 先不说人性化。 对个人的隐私财产保护绝对是一流水准。 外加帮派、生死、金箱、师徒等等 。 我在烟柳如画等你 ！玩了一年多了，情怀啊。不错的游戏。玩梦幻一年多了，都不给我整条罗汉，现在要我评论，是罗汉嘛没有什么可拼的，也没有什么可比较的。网易抓住了玩家的虚荣的攀比。这是个深坑，假如不充值，这个游戏就是单机游戏。希望大家记住，一旦充值了，钱可就退不回来了。充值前考虑下，把充值的钱用来花在吃的，花在用的身上比这游戏要好几倍。一旦你开始充值，那么就会忍不住继续充。还望充值前考虑一下。人玩游戏，游戏玩人…认真你就输了霸王检测，霸王封号，霸王抄家，霸王禁言，游戏无异议，售后极品到无敌，玩不下去了，玩家遇到问题只能认倒霉！这游戏 真心好玩玩了三天升到50级。100块钱冲进去一件50装备都没打好，更别说69.89的吧，喜欢玩的朋友慎重考虑吧，这游戏没几千上万是玩不好的。终于下定决心不玩了，玩这游戏要么有钱，要么有时间，不然玩不了。已经玩了一年两个月，小充了点钱，花了大把时间，最后让我伤心的是小福神，连吞5次，直接卸载不玩了。很喜欢这个游戏 一直在玩这个游戏要花费大量的时间，社交系统比较好了去也蛮多适合打磨时间，但满地都是RMB玩家，我这种花时间的玩家完全成了他们的游戏体验游戏不错不错如题再不出高神只能弃坑了很好很值得玩，大话玩家过来的觉得比大话要好玩和良心很多不错我2003年梦幻公测时玩的，伴随我整个高中，大学时期，曾经的记忆是美好的，慢慢的，网易把梦幻改的越来越商业化，有钱没钱差距很大，玩手机版更明显，像我们这样钱不多的，就只能玩双号，可是网易你凭什么扣我钱，我大号18万买的鬼子，用了1个多月16万转给小号，怎么就违规了？我被网易扣了几次钱，有几次是转钱，扣就扣了，md，这次我极品鬼子就是要给小号带的，卖低了被别人抢买了，卖高了怕被扣钱，想方设法取个中间值，还是被扣钱了，从此销号不玩了，没劲顶级香烟招收代理高利润高回报274221655很不错的游戏！力挺！如题，下载到一半就卡住，重新下还是卡在同一位置，一直这样，求解做得很精细，挺好玩的游戏不错 就是不能象端游一样可以交易货币装备。希望可以改善。还好咯颇具快乐是我的心都碎谢谢梦幻非常好很好哦。我很喜欢毁了经典，已经不是为了好玩在做游戏了，充了8000玩的真累。擦擦擦擦擦擦擦 你倒是出一只啊新版本总是闪退速改进速改进速改进以前玩不起现在觉得还不错不错不错非常好9点半了，等得心碎忘不了一直一起玩的伙伴们，游戏也是一直删除下载爱你的心不会变上去都不知道玩的什么满分隐隐约约隐隐约约一样卖个东西贵了 就说什么卖的东西不值那么多钱 交易异常 金币就被扣了 我就想问问 我们玩家是不是卖什么东西是我们的自由 想卖多少钱就卖多少钱？要是能转区就更好了很好哦好喜欢梦幻梦幻非常好的游戏  很耐玩 更有意思  。！！！就是希望能转运 出极品装备 嘿嘿  一直支持网易 支持梦幻！！真好玩又刺激好玩哼姑姑 好吧v vv v郁郁寡欢好哈哈哈哈哈玩了半年多了，很怀念也很喜欢梦幻......老玩家强势回归！随时随地都可以享受梦幻西游带来的快乐！友情，爱情也随之而来！不多说，爱梦幻，爱西游，更爱梦幻西游！打发时间，真心不错，很喜欢新手根本跟不上，很多东西自己摸索，打发无聊时间。天天玩。游戏不错。天天开心。放松心情。天天玩早八点到晚八点天天在线语音听不到 游戏很好玩很无聊的游戏，为什么这么多人愿玩！落寞KTV手游让我想起了小时候！很好的一款手游！挂机玩法不错，每天忙的时候也能抽空玩，花钱还算好不充钱也能玩，玩法挺多的，没那么容易厌倦，可以长期搞非常好，我觉得真的不错什么时候出五庄，什么时候玩不错祝我高法爆去七号位非常好玩，玩了好几年了！不是一般的好哇真心不错，可以不在孤单希望网易能让剑会出个1v1，2v2，3v3，4v4，5v5。这种模式， 这样让我们这些玩家可以选择自己的队伍进去玩。耽误我玩游戏不要太认真，不然会很坑赞赞赞很好玩，以前就是端游的玩家，现在玩手游更尽兴，更刺激了游戏太好玩了，很喜欢不错，就是不花钱你永远都是菜，花了钱你还是菜欢喜，梦幻西游无法下载 重启也不行啊啊啊啊很好玩，我已经爱不释手了我无语了 做什么都没运气小时候最经典的游戏不错的游戏好好好好好好好好好好好好好好好好水不知道为什么，就是感觉好玩不打算冲个5000以上还是别玩了，浪费时间。找气受。我冲了2000了还是垃圾1个。每天任务海底25没有一次是一次就过的，每天掉装备耐久。三四天修一次，到60就会体验到什么叫无力感。平民如果要玩没有非人的毅力就换个游戏吧。很好挺好玩的游戏很好玩 每天都要上太烧钱内容很丰富，活动很精彩，花样很多，副本很多，还可以结婚，让人眼花缭乱的特技，各种神宠……哈哈.还是以前的感觉好..比客户端好，没有那么复杂，奖励机制能再平民点更好很不错的游戏。一直在玩。从小到大最喜欢的一款网游，也是我接触的第一款网游！好，继续下去很好玩的游戏。玩了好久才来评价 根本不会腻。很不错的游戏挺好玩的，就是太花钱了门派多一些就好了好玩真的很好玩第一次玩梦幻西游是十年前，每天都泡在游戏里，路过，笑过，爱过，恨过！十年过后，碾转无数游戏，最终还是回到了梦幻，唯一改变的就是当年玩的电脑版如今是手游了！工作劳累后，玩游戏放松一下也挺不错的我要的是好的大促让人欲罢不能！你说呢？，你可以值得一玩当之无愧的手游排行榜第一！没有之一，无须解释。玩着不错，就是能不能让我人品爆发下画面比端游好，游戏思路也不错很开心第一次玩 感觉很好 就是有许多不懂 希望越来越好玩。就是应该自由交易 商业化比pc端游还严重euudhdjdsksiskakajshe快来吧我只想说什么时候能合区 都鬼区了。每天世界说话的永远那个几个人。10区喜气盈门总之太好玩了强烈推荐画面一流比端游还好 棒棒哒谢谢有你的陪伴不知道怎么玩梦幻的忠实粉丝，一直都非常喜欢梦幻这款回合制的游戏！非常棒非常好玩支持下真的都挺好的，就是太坑钱！可以不错你能让李易峰代言梦幻我就重新回归感觉很不错非常喜欢玩，继续玩…牛牛牛。好牛的游戏说好的更新出牧场的 在哪里呢梦幻西游手游这个平台是个好的平台我很喜欢玩，只不过我想问问我是后妈养的么？充了那么多钱打全出环也就算了活总出个好点的吧，活动不出洗宝宝总给个好点的吧希望多添加一些在线活动，不然刷完双都不知道干嘛了。还不错…希望系统可以人性化点很棒，支持感觉比电脑好玩，更加的人性化，而且免费。真无语了，玩了不到仨月八十级了四个变异成宠充了一千多，更新了一下号就没了？！又重新下载了一下小号也没了，真是呵呵了。玩了一年了 感觉棒棒哒千万不要下浪费时间非常好玩的一款游戏这次更新后只要用无线网就卡爆炸 4g也卡 以前从来没出现过 弃坑了0元党 出150万精求gm爸爸照顾还不错，无聊的时候玩玩一直喜欢这款游戏，gm求照顾娱乐非常好的游戏 就是没有钱啊啊啊啊啊啊啊真不错，好多朋友，玩的很开心挺不错的一款手游..就是不能交易物品，买卖不方便..好玩很耐玩的游戏 希望可以出现坐骑和光武 角色造型多变一点玩了不少年了，很好玩游戏可圈可点总体来说可玩性很高前天还秒完成 这两天都不完成了 泪都下来了 智障bug永远支持国产，手机中的战斗机，欧耶！很好玩的游戏，角色萌萌哒，炫酷的制作，超凡的体验，一起来爱生活爱梦幻西游吧。做个零元党   很好玩好好玩，10个赞账号的角色呢？你特么吃了？很久没上东西呢？麻痹玩毛啊很不错的游戏手游不得不说。我玩这个游戏挺久的。宝石买不起、修炼点不起、法宝填不起。宝宝走到哪都是一回合死。组队没人要。在这里提醒各位不充钱的玩家，不充钱就别想开心玩这个游戏，纯属找不痛快。赚个金银币简直比登天难。太有意思了坑爹西游 老子充了几万块坑的不要不要的 再不会冲一分钱给你 下载完清理仓库装备宝宝卖号卖金币 没见过这么坑爹的游戏 垃圾西游 大家不要充钱了 投资无收益的。可以的不错一入战斗就动不了了自动还是手动操作人物永远不会动的，好垃圾！！！基本动不动就要花钱，玩不下去，卸载了给1星都嫌多，负1亿星才符合，30级赶紧卸掉保平安，这是给无业游民，端游打金宅男准备的点心，又累又无聊。想玩游戏，没接触过网易的还是在app找国外的游戏，国产记得珍惜生命，远离网易，网易旗下所有在线互动游戏都是非常耗时非常累。————一个刚从端游7年脱坑的175帮战LG只是想消磨时间玩玩行，入坑就完蛋…太赞了有钱人玩的游戏当你还是用系统送的宝宝时候人家土豪开服2天左右就有神兽了当你省着钱攒下点金币想买个稍微好点的装备时有钱人早就是当前服务器最高等级和装备还是一套蓝字的。你说宝石？梦幻西游的谎言满宝石满修只是对土豪说的，当然你终有一日也可以满但那得猴年马月去了 玩了半个月差距太大太明显了 弃坑say goodbye！点击下载，什么都输入好了竟然来个无法完成，垃圾，完美的垃圾游戏不错，就是交易不方便！个人觉得游戏做到这种程度真的很不容易，游戏中充满着我们自己民族独特的文化和想象力，游戏多样化也越来越丰富。但是每次更新都是只有加没有减，只是增加了新的却没有去除老旧无趣的，游戏包裹越来越大。作游戏就像写书，更更改改、添添减减，才会让书既厚度合适又内容充实。另外，新增的变身卡，银币消耗相比于修炼占比太高了吧，修炼宝石才是游戏的根本，为何把枝叶搞得像蒲扇那么大？！一直喜欢玩！很愉快的游戏！卡卡卡卡卡卡卡卡卡卡卡卡卡卡卡卡可玩性很高游戏不怎么样好好我因梦幻而喜，我因梦幻而忧！前期钱特好赚，但是不够花，需要再充钱，或者慢慢攒。等到后期基本你就啥也得不到了。挖宝图，金币放妖，任务顶多给个破宝石，都他妈想弃坑。小号捉个鬼得两朵花，大号捉一天什么没有免费不要钱，画质真心赞，回合制的巅峰。。。。。。支持梦幻西游，11年老玩家没有一款游戏能与之媲美多来点兽决有藏宝阁就好了用心玩一个号就会有回报～垃圾游戏摆摊卖东西乱扣金币，明明没有违反交易规则，正常标价卖的稀有宠物，鬼将，85级高比，连击，吸血，偷袭，满内丹加高级内丹，22万金币居然给扣了，申述都没有用。非常好太好玩了我是看刘诗诗代言才重玩的，没时间就不想玩，现在看到诗诗，必须支持，不过说真的，是还不错的啦10年梦幻之旅，很愉快很好玩的游戏一般是战斗的时候，苹果最新ios这是款很不错的游戏，值得推荐。真心好玩的游戏，大家一起来吧，等你哦！要是跑环能给我点90书就更好了，，，哈哈加油打发打发时间98765432110000个赞，美中不足，有需要改进的地方：1太烧电，2，藏宝阁，3，宝图封妖什么的，就不要限制次数了吧？读书的时候就有玩，这次手游版本做的还是比较好的比较满意挺好的还能肆无忌惮的放纵到什么时候，能玩儿的时候千万别选择束缚。。。耐玩，就是看着别人容易出东西，自己一件不出，是不是有托呢推荐大家不要玩，正规操作都能扣你金币，可能几个月的努力瞬间就会付之东流，gm想怎么玩就怎么玩。好玩好不错真好玩啊好玩，我玩了好久，可是为什么老是不给我好东西，我想哭了，GM给我点运气吧画面很美…不过这种脑残的，你敲我下，我扇你一下的模式太几把恶心了垃圾游戏千万不要玩洗了不错的宝宝，开心！！！！！！！！！！！！讲真，我第一个游戏就是梦幻，在05年就开始玩，当时真的疯了似的玩了好几年，后来一段时间不玩了又上去以后发现一切都变了！没有沉船了，新人直接升级到三十四十级，那种回忆对一个老玩家是多么重要的！它变的更加物质化了，各种新玩法，各种卖钱，真的玩不了了，于是再也没碰了。前两年玩了一个叫神武的，和梦幻特别像，但唯一不同就是特别拉进非人民币玩家距离，充不充钱都可以玩的很精彩！现在神武手游也越来越完美，聊天，服战，真的很有意思！苹果上的下载量就能看出来。梦幻西游从此成了我一个回忆。终于找到地方吐槽了，玩梦幻大概一年了吧！本来感觉还好，打发时间嘛！可是系统为了打击刷金币交易，不顾正常玩家感受，强制扣除玩家金币及交易物品，也不知道你那系统是怎么测试数据的，反正想扣除就扣除，才不管你是不是真的，辛辛苦苦挣来的金币瞬间就被没收了，申诉也没用，这样让玩家怎么还敢玩下去，怎么敢充值，唉，失望透顶了.....好玩陪着我少年时期的游戏现在重温经典国内游戏都是骗钱的 都会暗改数据的不错不错有端游的感觉垃圾手游坑我200万金币以后不会再玩你网易的任何游戏自从出了手游一直坚持玩着。这周新开的跨服聊天真的很方便！希望慢慢的更新优化。以后能够跨服看空间跨服组队跨服结婚最后到跨服生孩子。哈哈哈刘诗诗代言的当然要玩起来看到刘诗诗代言了，就下来玩了 。挺好玩的！(?'-?'?)?好玩就是太耗时间客服超级霸道，他们不爽还能禁言！压根不跟你们理论，一副爱玩不玩的架势端游简化版之前版本几乎没什么问题玩的好好的  更新了之后各种闪退  挂着机就突然闪退了  还各种卡  开4G不卡  连Wi-Fi就卡  网易是跟运营商商量好了吗  游戏本身能检测到闪退GM发消息说系统崩溃带来游戏不便请谅解   好的我谅解你  因为你辣鸡依旧梦幻好好好好好好好好好反正都坑钱 但是老玩家还是喜欢玩打发时间还不错，挺好玩的。每天活动固定。诗诗太美了！！！！！开心~~~不错的游戏爱梦幻玩西游512距离帮派收人，无任何歧视，长玩的都可以来，开心就好。如题一起来玩吧大爱的游戏。。不错，挺好玩哈哈！好玩爱生活，爱梦幻西游。有的优惠其实可以降低等级怎么玩啊誰教下我因为女神刘诗诗知道的手游，童年记忆很好玩！！！wifi玩没问题，手机流量玩就出现如题的错误然后App就隐退到后台了。这个BUG何时才能解决，CS大神们！？消磨时间，感觉很不错。非常不错的游戏还是比较喜欢这款游戏的感谢梦幻西游的，伴随着我的成长，坚持玩下去。小白猫你还好吗？非常好玩从初中就玩的游戏  非常喜欢 一直玩到高中 因为学习才没有玩了 现在已经工作了 发现有了手机版的 就下了玩 延续我的西游梦 非常好的游戏 希望能做的更好再一次重温梦幻，很赞。今天很伤心，120块钱买个宝宝，结果让收了，去官方投诉，竟然全都是机器人，准备已经弃坑了！！！梦幻 好样的好游戏原来只是想找个游戏消磨时间，看到梦幻西游应该还不错，就玩了，一玩就停不下来了，每天必玩只要游戏善待我，不坑我就好了 gm好我很喜欢梦幻，从小就玩，有手游更能好好玩一下了十年如一梦 梦幻西游 最爱比以前更有视觉效果了罗汉罗汉还可以新手，特别关注的游戏，自从玩上这个游戏其他游戏就在没有接触了，不错的游戏下载不了！！玩了很多年了 非常喜欢这款游戏 细节做得好 情景优美生动人人都玩，你怎么不玩感觉还是蛮经典的！说句实话，我挺喜欢这个游戏的，就是总是闪退，两三分钟闪退一次，或者点开某个东西也导致闪退，这怎么玩？即使在喜欢，老是闪退也变的不喜欢不想玩了。一天闪退86回。没心玩了现在更新的越来越严了，没一开始那么有趣了我手机号换了，想登记身份信息换手机号，可是上传照片的时候闪退，一直更改不了！客服和技术快给我解决啊！！！几天上不了游戏了！1111/！fjfud感谢官方客服我玩这游戏很多年了，很执着，从电脑版到手游版，在这里结识了很多小伙伴，也给我们留下了很多很多美好的回忆，在此给网易99个超赞，也有个小小的要求，手游是不是也该岀个藏宝阁呢？一个安全的交易平台！那样就更完美了！！值得一玩的游戏开服第3天就开始玩了，至今1年多了，这游戏回忆太多，花钱也很多，1年的时间花了3万。这游戏社交功能非常强大，不是一般手游能比的。我想这大概是梦幻最大的魅力，回合制挂机时间很多，闲着就跟朋友聊天。不过最近满级了，无聊了。在线时间也明显少了，希望早点开100级在智能手机普及之后，我从来没有见过班级里出现过那种“半个班级的人在玩一个手游”的现象，但是现在梦幻手游已经做到了。现在我们大半个班的同学都在梦幻手游的天下无双服务器里玩，还创建了自己的帮派，虽然不强，但是因为大家都在现实中互相认识，所以和和美美的，就算是帮战输了也不会吵架，偶尔因为有事不能上课，还可以干脆通过游戏给自己的死党留言，让他帮忙签到一下下。其实有时候我们自己都不知道，是因为我们现实中互相认识，所以才能那么愉快地享受游戏，还是因为游戏，我们在现实中变得更加亲密了。出个高级神佑复生给我我是在国外的，没有中国的手机号码，也没有网易邮箱，用的是谷歌邮箱，但是每次上线都要打账号密码，很烦，希望能改进一下啊，跪求。希望以后你们给我带来好运，爱你，真的爱你坑钱的垃圾！！！买个装备系统把钱钱和装备都给吃了，还他妈总开新区。坑钱坑钱不错不错！玩玩吧手游感觉还不错挺好玩的、好游戏啊蛮好玩，就是洗不出变异好烦很垃圾的游戏，到处是坑，卡顿漏洞百出，至今还未修复漏洞卡顿，客服根本不理会顽家。你冲2000元，不到10分钟准时把你坑完。简直是一个巨坑装备打造太刺激好玩少年时代的最爱停不下来洗出来的爱的不要不要的你能不能也爱我这是我们中国的第一个网易大型游戏/好玩希望越做越好！非常好啊谢谢给我出的罗汉很好hai?x游戏不错，从来没有得过好东西挺好的，老玩家了，来支持，再接再励一般不错的手游以前都不怎么玩手游的，玩了下还不错，画面很精致，操作比较人性化，就是有些不太会，新玩家，嘿嘿，因为刘诗诗代言来试试看的，要是女神陪我一起玩就更好了哈哈怎么 不更新  诗情画意区  没有，这都25号 晚上十点多了，，好玩感觉挺好的,有儿时的回忆为了诗诗下了很好哦看到评论都是水军，我也是醉了。玩这个不花个几万块你还玩个鬼？想不明白为什么有人玩这个挺棒的，玩起来很方便，希望游戏一直做下去！6点30了，服务器列表还是没有新区！！！很喜欢游戏一般就是烧钱上手很快 运行流畅 是我接触的第一款游戏 很好玩没啥好说的，就这样呗！给只变异更爱你(^з^)大家都来玩吧！！玩了一年了，冲了不少钱，这次跟新后怎么这么卡？冲着诗诗姐来的^_^十来年了玩梦幻的心依旧不变为什么最近几次更新一直更新不了，老是说下载不到任何patch，我家网络20M光纤，下载4、5M每秒，跟我说请检查网络是否通畅，垃圾！就这个游戏事最多，从一出来就玩到现在，最近真的快有删游戏的冲动了！！！好游戏辛苦版本更新快一点吧早点出化生寺门派法宝良心之作垃圾垃圾两个号都是89，ST号鉴定出个70破血鞋子100万摆摊，我自己DT买了，呵呵，给我来个非法交易，没收DT资金，垃圾游戏没话说了，退游！爱生活爱梦幻西游咦赞情怀如题，别的都挺好的永遠不會及時更新 一定要等app store更新垃圾游戏很好玩的手游  我玩了好久  冲了好多钱";
//        LearnTool learnTool = new LearnTool();
//        NlpAnalysis.parse("说过，社交软件也是打着沟通的平台，让无数寂寞男女有了肉体与精神的寄托。", learnTool) ;
//        NlpAnalysis.parse("其实可以打着这个需求点去运作的互联网公司不应只是社交类软件与可穿戴设备，还有携程网，去哪儿网等等，订房订酒店多好的寓意", learnTool) ;
//        NlpAnalysis.parse("张艺谋的卡宴，马明哲的戏", learnTool);
//        NlpAnalysis.parse("还有福神就是一个坑神，赚到就收吧...从读书就开始玩，现在还在玩！谁能告诉下会不会出转区游戏讲真挺不错，但有一点极其坑：占用内存会越来越大！！！！！！\n" +
//                "越玩越占内存，本来400M＋最后变成了1.5G+，虽然显示的仍然是400多，不信的可以重新创建个角色玩一会，你会发现剩余内存变少了叫啊叫的肌肤难道就是没什么好玩，希望以后好运来，多出珍品真心不错整体还不错 就是升级太慢。娱乐活动太少 每天做完活动任务就不知道做什么了。只有捉鬼封妖了非常好玩挺好玩的，有意思大爱。很经典，游戏画面也非常好，希望网易越办越好。好玩jjjiiikkkkkkkkkkkkkkklnhggghjnmmkoo哈哈，就喜欢回合制游戏如题 这次更新后进不去常玩的那个服务器 其他服务器都可以进！不错好好好非常好玩儿，一天两个小时，你就不想放手。好玩多给我来点珍品装备吧好玩，真心好玩，玩了就知道。希望开箱子开高神，打装备出特技好垃圾游戏非常喜欢的一款手游...很喜欢人气爆满、真心好玩.不错游戏 和端游越来越接近！副本 人物变化越来越多！支持走下去，也希望自己运气更好一点！娱乐而已。", learnTool);
//
//        NlpAnalysis.parse(s, learnTool);
//        //取得学习到的topn新词,返回前10个。这里如果设置为0则返回全部
//        System.out.println(learnTool.getTopTree(0));
//
//        //只取得词性为Nature.NR的新词
//        System.out.println(learnTool.getTopTree(10,Nature.NR));
//        HashMap map = new HashMap();
//        map.put("s","a");
//        map.put("a","s");
//        Set set = map.keySet();
//        ConcurrentHashMap map = new ConcurrentHashMap();
//        map.put("a",12);
//        System.out.println();
//        CountDownLatch c = new CountDownLatch(2);
//        System.out.println(1);
//        c.countDown();
//
//        c.await();
//        System.out.println(2);
        Exchanger exchanger = new Exchanger();
        exchanger.exchange(13);
        System.out.println(exchanger.exchange(1));
    }



}
