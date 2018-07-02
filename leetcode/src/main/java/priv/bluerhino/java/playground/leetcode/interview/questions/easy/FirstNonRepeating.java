package priv.bluerhino.java.playground.leetcode.interview.questions.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by niekunlin @ 18/7/2.
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/34/
 */
public class FirstNonRepeating {

    public static void main(String[] args) {
        System.out.println(firstUniqChar2("uindrseqbljlhqvlwvgdebeihttirikuahlikgnahvgnptmqwbovmuwesxkvcitcwrwrucsbbfqvldridfviduqvmfcmeiphoqupbitnwdbvevouoaetisdmgvvvwoglwtgjrpcbghxkrkjthetxeexbphbjiehaicuicgnirslhdstgmqcdnlulpdpadjdltfouwhfqicfcqntnpeqaohslwkhbvflxaudembsrsindluthxapnmrqinsivbxmkohubvmmmpmklbfrmeuvdrhptdmelmjjefgbsqqlbqhvsmswwxrlkutadqbbeisbgfrcivvoxmxxptrscxnjjvtajfhqiucdihihcutxhlonlomfdnbwanrcnbarojsajseqrgkuqgkcnvrghxnmbclfomktwfaakodeecsglufvobkgoqsbrhdiuhxqbcndkmxuertupngvnkgwrfwgdbiurbooxariklwarjgavsuddoveipltessrssxwxgvrrtkisnbavkbpaphicxhapjjpkccakepuafjdaswfwfmbdmuuaveukxvnpkgmhcjcpqntssthjlvrngugbhrivtwmbrvrprrlfmvwjdkonfmgnepqoxwfcvefjihisarwskjfmqrjlkbbugfawmkqgfxgpokkxxivqbqimwsccdekjegwcxhmmuhpstxfpofwmrmhrxeptxwbvxsesheijjfsshgrrwckjkmbslpbngnwhokjnujtiepfrdhiwwgbffixaidabacaibummwxgxowsewlqfxrkarjrkqxmxwobqbcoowmbggtpoqadhqdxlhvxrkfuwpxxgnchudreoeuefkqhlrmwwfvjexvbxdhtdngwvoohpjtdbdbesceiafrhenfljleegsencfmbauxlltfueudnjxsiiggsfwiuidgktsbtcvxtdllviocfdbonjciosucbjidwxnogmnveqkcrxbpamfxwxiugjgrfpstromuxxdiodqeoqdlfulttraquskhwfholbrcbchijlgqvuwxvejedikvgetlmrcmeampdgjvmbdovkcjilbralhmniwvbeandldnudkpjvhoqtfdwllridwljfvflfdrbqadvabggwsiexrthrngexpebuhtefkqgkkjoopsmunesfotsprxuaswwenhkdvsspkppulecahkkvccqngeaoijjgvsfqfpvphvhdnkkcqsebhijkvfpqjmarbkpejagtbtisnflrrvawmvfxeccxtrmorihgslxlqrqcmouojjfhcieuwlrcqhevmveookgonxqdbtgqjimsidnaaiuchwkfkpxfptuvhfqemojixqvhgokdekdwbomptqqlfiaiptxvgfmovdqxupjxjpoxuplsagxpgpmvtcpawkrrthvclhdbpqeucchxptdceswhnqocmeocpgthkgxmxggwlnantwwuoqpmnpvgateitxlocmhnihmfgjnvrggenbhnjfubtoteojojjkjpcnwqthxhlfukingjletwnxdnjwrgjopqoxtqcvwsakqxxumbtcblufdmdvxfkshitenmenkxjvblsoiyhjpakinimwxhcebabgsvqftfvwjnstltjawhwipkubadtoxqrutkwxjnmfoowtnvqplvqokcuwlkmxxhboampcdwokjfxggtnojebagxlwaeowtomubtbfsrufkttugfpnxmipkcsphqafjuxovwpcgonhiqmomsweunoeqkpkxxsdksmufowqpmkontccckcdbwrfwamikananakgjkahndrepemcgxecgpltvdbpoexemnrejdephuuxhfcubxlbdrmhvmeqmtdhnbkwnidigxdantmkckijiecavkpumegrbveffclcltmibjcstrrauphfxxssgxkkirapiihnlbrodvfostahqdkajqtrrfwdsemwxlucbbjjspnnqjnpnpmimhulgoskwpsactexmkfdhaihnlggqeunqevxfrpiwskhrhgfluelshqejavomjshfomvgpugqesbtakvxqwrtguuebcgqphocglfrircfvuikfbviomfrsnpvvlftwrkbmjpvdpgvohtmxcxwnuhwojnfvsfwvdlaxxlmafihpussffcawjpaxdwerwfbvsbipljualcnhseealvqiqfiaiskaafufaubvhjglktfhbdsaskmedroxkrxshnggumcbtdcablawkodmnafkjekuiecqlvbxocfcwipaicgndfafjhtjcelakrecmntjxeqjqgxkxapuobbcaxfrpsktjswxdfvugmmgjwiphnsclqwmranthpiueffaxvhplajqsrtoxbixbdpcfkbpkjkelemubwachcpxcniaqmkmasmvlfcubcdkxfkupgcgbrvmbmgnjgfbawmmdritdrkppswatwtdjemhifhmshunkvaivhteqnwkdcrpfxmrafupfhbgligbvrqjkvcgbiqudvtblhfgetffduvsfhsmjimgruxrvbqniluapaoniwhqhltbxvrphmlisfaomqoecmdbbrgujgsbdelkbddcgmpggogfonssxisphbwljlvhwhewmpqugxgbubqfeilobxxhtcxmxvjtbuavxlaghhjiemihvrsjxbleutpuumgndtnocwkpkdaupbmcsahcbwoelmgnwqummmekwhpahtdvehoprfcciwqphfwppscruimikiximhbkdomovbdalsihioncpaclevxawqcqthtmuogolkrvlipropmnmecttmlecpapdlrcqxopfjobgsvhcadqiudqjoscpvjguddnorldkpqtoocrtkcutkvdpbkkekenpqjmxmuxccamkwwxrdrbdmameptvcgsltqdasicoouvdtbranexokmtkioptqblrruaihvfvvebjigkuwwgearxvmimlgmxgpvbnotepprknjxcunheclsvxxmmoufvdhrwxqlrkmvcaxtbiqrjrnrsfrkvttnpxbspnetcofhpcbcphrchivnrskkalsvdllhtisnaerxbcxutcpmnquwrutmmvrtchhheplhdmbfkrrrxalosjbebtdqtsjbdcuuatgldnubigijbkehxsmhsadwtcbwinlnilthiqslvsduspkjuunpetcofujbqhtkmalnjmllhulckqodbgffxdiqjajecbmlekvepkirxnguqnpnfjdptinuphcoxkoqhqrmkkawmngqwvfpcuxgpekkprupplsbwshmsduaitlhcjargacduewtqgnxbtpwrkawpncarxlsnardkftmsdjflmhoplghandjisupacixxthwokctbxekqwbmhtoutgrogxsdnmcaqrsqrpigbigqhsmrksxgkdbdbxkwimpehltcffuhrphbaqgvabjduudbrxgwiljkwijvaugnleamskjijhnvcspagsfnhjielrvxddxqfgaipfflffksmvgaioaclfsjhovcotoaiwhhnmrudsqmsepsgdofnxjjcgdejutmdtgauuvuepajlikebtpgfimudswplfwgaodtwqjuaujlbqqartevsqesmrpknoanfprqcwochqdrcvquovtsogptduvfiaislfvpxwsqitodxwckprpfxtqhbdixklhtsajqgbinfpdqaehrwhnwggmggnbstolrcbmlhpfjurbknpwbrfhvdanrjcwnvsxudagbkhdlwujqvwpbbgmsfrkgutkqwxqfemaaokrfdocsbbktwaugoadgvqcdhmqkworbvxqwdpmbjkqghmapevrsnaaparwnbvcfnhhgfqplfwiswrxxistamulcbxcmvkbcxsgftbmbvqlxrhbmcujkktdvcgnjkfaclxndtjkdbgqvbqxicgmpowbjsfvspvxtrovjwbbkaapfgcqbifdosnmutvfbgdmhiqvflasedhafqnmrlmwbuhmptnkvvojnjngiepmdktewwsuxernpfmktsgwwnxfvmuotpfxfntcrsjpldmringfpkpievvbgbghevlmuticukrfvahrmtkvckjbxxrmkilbeojsxgbvbhsgvkhgtjddoreipbkwiqbkecobfexswiwttlohnfwokixfmfrpadtudrssiobbvhctpbeesiogwhdqojoalxpxikwuheilvsrxbfbnckjeswhkfviihvwrfxkxcomhvsjojhltospooumkstqqnvxmrowlrtufhxkipxnfecchklrqljfwnglxeharemawsbvnuentnapewjhnzbieisjtomdqtjkigisgopmgcfqxcxninrisupchhmfrosxgdtakhrrnbbnxovvbfjgwdgnlxoxswhsfjeijvivqemoekkmrttscthlpglaorarhibrucuhikfkphqmhowloobeumlikqmmlatesupiekwjhdvntnjbakohrbobimmujkbatfxpmgfmmqsgwsffcbenwgdrhlqrsmfghevnjfdlxupihmkptsefubmixhacnxngpjrckxhvhrelolqwevoqklhxbplakmsxdetvpuddmvaodpglmsknbvfftstckjurbntwqenuhcurxqvotrxfpootqkobeatoduihwhpjxxrvboggkcxagnrrfwfuaqplirlnafprumnkcjxlpvanfmqwuoaupqptqeulpwvnhbahbkihustenkbdushjakemufdhjllnowmvgpdxbrhxfonpgcjslvwgdmajicqqmdxubrofvdodfsedjghpbjncgkckeudxwascljlraoodwvgpvojcqgbalntslsfrwnfcdvidsdrvwhscskpalubxeobapkgpdsqcjpwkednraijmbcreplwijofniggavpdlwfmwnvsaridhbppeolakquhamneffnfmbruivassdaaikxiaxupgdpgkfojvkkagcsmqnweofwikvevrsottkbtcldoruakajinnlgxmpddcrmohaktsdrxjelrbmfdthspikxeocqqdordrqwjtaxihswcubtfomksaxddcvtadnrtqkmdnacgduudtdbhsgpfomrdiaotcfwqlxccqeelgtnkflgixpjcriroruhbbgpidwkggdevpfratqebewaxcudseaikqjuuhpsguvtwxniofskkslfnrphatmxngneuituefcxufisrsjitqxwufrgidbwlmkrqojpwpljasaiukwwthrudhcocoguerakhajdncxbrnuavoqeuwsamwdqgutbaoixcgeibpoajhedooqcewiqvddedmanxljjjcbojgbmwabkfbvamgnfpncdcxoaqhmgurifpwpgrpctlqpwmqraknjltneknsphtwbnbiahknxipsovljkivlpggvldeveeopvoqlvfjbratadttlcecomllpkdgiloeedquivsnmxkfcvrkwaohgbrbvjklkktgwtlfgafqgbigheajrvffvvkkmibcedfmnwasopoqgxjohjoqnijeaifuwiwmogkwqlfmibuwecvnulvhkbsukscqlqlsxjulillmlgjkrbmllcunhbqmbujftqgkpwkvemthigednfohxpsduotwfnknfjbexflcfieaosnlhndsorbkcdlahovwbccshmrlcofowrmqajluiqaarnqtxokbaddswftiexiahmstpbonwmhvqgcpmfrocvtwfhjrtsupscfmvwfvaoolanrlgdsvgoseltdnoxrdglockhwlvffaakgrxjfnfbxnbprfvpwmexnhfekjnkenbohhmwlqoteiwgtjsrnceptbgwkfcmtkliwwqskmsoihmnbjsvnmfkwbwemijdtpnajgrousbrdaagenqlgeaiixfgcbfhceaxkwxbpksfouuqcvcerqecpdtvtsubbadmaatdnmnqhladeiapejkxffoagbwqbvppssvvvhlvhntatxlvqgjxbejpvxemqbdjknuogumrwbognklmvjsldrktpeowiuaapbjgktxwfjiferxgmafbcerteqlvpqvxbgdwiufdctkwptadtujmifppudubpmdtiedmqhnihquansnjufpbuumhhmidphkwusjdsdaocavtauhsvtgcoqhufmacwcbxvjmagkounkoqpcnoanhgwsjvgtlwgvbpdbufekosgagfsmadmvbonkrtcbspoabugkcjeebqhqwfjcqlqjvabaqecofgwskqplgup"));

    }

    // 暴力解法
    public static int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        if (length == 0) {
            return -1;
        }
        if (length == 1) {
            return 0;
        }
        Map<Character, Integer> characters = new HashMap<>(length);
        for (char aChar : chars) {
            if (characters.containsKey(aChar)) {
                characters.put(aChar, characters.get(aChar) + 1);
            } else {
                characters.put(aChar, 1);
            }
        }
        for (int i = 0; i < length; i++) {
            if (characters.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        if (length == 0) {
            return -1;
        }
        if (length == 1) {
            return 0;
        }
        int[] bytes = new int[26];
        int tmp;
        for (char aChar : chars) {
            //0到25
            tmp = aChar - 'a';
            bytes[tmp] += 1;
        }
        for (int i = 0; i < length; i++) {
            tmp = chars[i] - 'a';
            if (bytes[tmp] == 1) {
                return i;
            }
        }
        return -1;
    }

}
