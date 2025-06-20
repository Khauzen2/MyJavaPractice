public class MusicPlayerActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private ArrayList<Song> songList;
    private int currentPosition = 0;

    @Override
    protected void onCreate(Bundle saveInstancesState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        // Initialize player and load songs
        mediaPlayer = new MediaPlayer();
        loadSongs();

        // Setup play button
        Button playButton = findViewById(R.id.play_button);
        playButton.setOnClickListener(v -> playSong());
        loadSongs();
    }

    private void loadSongs() {
        System.out.println("To be continued!!!");

    }

}
