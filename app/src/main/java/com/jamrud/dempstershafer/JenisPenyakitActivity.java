package com.jamrud.dempstershafer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class JenisPenyakitActivity extends AppCompatActivity {
    List<JenisPenyakit> listJenis;


    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_jenis_penyakit);
        this.listJenis = new ArrayList();
        this.listJenis.add(new JenisPenyakit("Karies Gigi.", "\tKaries gigi atau gigi berlubang adalah suatu penyakit pada gigi yang ditandai dengan rusaknya email dan dentin yang disebabkan oleh aktifitas metabolisme bakteri dalam plak pada jaringan yang menyebabkan terjadinya demineralisasi akibat interaksi antar produk-produk Mikroorganisme, ludah dan bagian-bagian yang berasal dari makanan dan email.\n\n \tMulut kita penuh akan bakteri yang terdapat pada gigi dalam bentuk plak, yang berasal dari saliva, maupun berasal dari sisa-sisa makanan.\n", R.drawable.p_kariesgigi));
        this.listJenis.add(new JenisPenyakit("Gingivitis.",  "\tGingivitis merupakan peradangan pada gingiva yang terjadi akibat respon tubuh terhadap akumulasi bakteri plak gigi (biofilm mikroba) pada daerah gingiva yang menyebabkan iritasi, kemerahan, dan pembengkakan (radang) pada gingiva (gusi).\n\n \tPenyebab gingivitis terjadi karena adanya penumpukan plak yang menyebabkan terbentuknya kalkulus sehingga jaringan sekitar kalkulus menimbulkan respon terhadap mikroba tersebut. \n", R.drawable.p_gingivitis));
        this.listJenis.add(new JenisPenyakit("Periodontitis.", "\tPeriodontitis adalah infeksi gusi yang merusak gigi, jaringan lunak dan tulang penyangga gigi. Pada prinsipnya disebabkan oleh ketidakseimbangan antara faktor lingkungan dan pertahanan tubuh.\n\n Faktor lingkungan meliputi komponen infeksius (bakteri patogen) pada kondisi gigi. Bakteri patogen yang berhubungan dengan penyakit periodontal antara lain Aggregatibacter actinomycetemcomitans, Porphyromonas gingivalis, Prevotella intermedia, Tannerella forsythia, Fusobacterium nucleatum, Parvimonas micra dan Treponema denticola.\n\n" +
                "\tFaktor gaya hidup yang kurang baik juga mempengaruhi periodontitis. Seperti malnutrisi,  merokok dan stres dapat merusak pertahanan tubuh sehingga berperan dalam perkembangan penyakit tersebut \n", R.drawable.p_periodontitis));
        this.listJenis.add(new JenisPenyakit("Pulpitis Akut.",  "\tPulpitis reversibel adalah inflamasi pulpa yang ringan hingga sedang disebabkan oleh rangsang noksius. Namun apabila penyebab radang dihilangkan maka pulpa akan kembali normal.\n\n\t Faktor-faktor yang menyebabkan pulpitis reversibel adalah erosi servikal, stimulus ringan contohnya karies insipien, atrisi oklusal, kesalahan dalam prosedur operatif, kuretase perodontium yang dalam, dan fraktur email yang menyebabkan tubulus dentin terbuka.\n  ", R.drawable.p_pulpitis));
        this.listJenis.add(new JenisPenyakit("Pulpitis Kronis.",  "\tPulpitis irreversibel adalah radang pada pulpa yang disebabkan oleh invasi bakteri yang sudah menyebar sehingga sistem pertahanan jaringan pulpa tidak dapat memperbaiki dan pulpa tidak dapat pulih kembali.\n\n\t Pulpitis ireversibel ini merupakan kelanjutan dari pulpitis reversibel yang tak kunjung dilakukan perawatan.  \n", R.drawable.p_pulpitis));
        this.listJenis.add(new JenisPenyakit("Kalkulus.",  "\tKalkulus atau karang gigi adalah endapan mineral, yang terjadi karena sisa makanan yang menempel pada plak yang terdapat pada enamel mahkota gigi yang tidak di bersihkan dengan baik.\n\n" +
                "\tKalkulus dapat menyebabkan terjadinya penyakit gingivitis kronis, gambaran klinis terjadinya gingivitis kronis yaitu terjadinya kemerahan pada gingiva, edema, pendarahan pada saat probing, pembesaran gingiva dan gingiva yang lunak. \n\n\t Pada pemeriksaan radiografinya tidak terlihat adanya kerusakan tulang. \n", R.drawable.p_kalkulus));
        this.listJenis.add(new JenisPenyakit("Impaksi.",  "\tGigi impaksi merupakan gigi yang tumbuhnya terhalang oleh gigi sebelah atau terpendam oleh jaringan lunak sehingga tumbuh tidak sesuai lengkung rahang. \n\n" +
                "\tGigi impaksi sering terjadi pada gigi geraham paling belakang yang mengakibatnya gangguan fungsi pengunyahan dan dapat menimbulkan komplikasi.\n\n\t Oleh karena itu gigi impaksi perlu dilakukan tindakan perawatan dengan segera untuk mencegah terjadinya komplikasi. ", R.drawable.p_impaksi));
        RecyclerView recyclerView = findViewById(R.id.recyclerview_id1);
        RecyclerViewAdapterJenisPenyakit recyclerViewAdapterJenisPenyakit = new RecyclerViewAdapterJenisPenyakit(this, this.listJenis);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(recyclerViewAdapterJenisPenyakit);
    }
}
