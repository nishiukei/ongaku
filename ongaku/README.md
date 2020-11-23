# リズムゲーム  
[ダウンロードサイト](https://dply.me/pkmcc6)
音楽ゲームをandroidアプリで作成しました  
上記リンクからダウンロードできますが、「Deploy Gate」のアプリが必要になります  
QRコードを読み込んで案内の通りに進めてください<br>

<img width="1440" alt="ito-install" src="https://i.gyazo.com/3d8d674ed1d6862f2c2ffd4fc262ddcb.png">
<br>

# なぜ作ろうと思ったか
　就職活動の中で、Javaを使うならkotlinも使ってみた方がいい。というアドバイスを頂き、kotlinにも興味があったので作成しました。
　自分が作りたいものを作り、集中して作成に取組み、スキルをしっかりと自分のものにしたいと考え、作りました。
javaとkotlinは何が違うのか？ということから勉強し始めました.こんなにもJavaとは違うのかと驚いたことと、日々プログラミングの技術は上がり、色んなことができるようになっていくんだなと感じ、さらに勉強を頑張っていこうと思いました

# ゲーム内容
BGMを流しながら、リズムに合わせて効果音のボタンを押し、即興演奏を行いましょう。

# 工夫したポイント
ユーザーに必要な情報を簡潔にまとめるということを意識しました
1. ボタンを大きくし、操作性を高める。
2. 画像が変わるようにし、耳だけでなく、視覚で確認させる
<br>

今回はkotlinを触ってみようと思い作りましたので、最低限のものしか実装していませんので、これからもっと改良していこうと思っています
# 作成期間
- 2020/11/12 kotlin勉強開始
- 2020/11/14 android studioで作成開始
- 2020/11/16 各機能実装完了
- バージョンアップを継続中

# 仕様
- kotlin 1.3.72
- android studio 4.0.1

# 主な機能
- ボタンを押すと音が出る
- BGMの音楽をずっと流す
- BGMのon/offにより、画像が変化
- 効果音を6つ配置


# 操作の手順
※「Deploy Gate」というサイトを使ってアプリをアップロードしています  
Deploy Gateを使うと専用のアプリをインストールしてからでないとアプリをインストールできないようになっています  
はじめに表示したリンクのQRコードからDeploy Gateのアプリがインストールされていない場合は、インストールの案内が出ますのでそれにしたがって進めていただければ大丈夫です  
途中で「提供元不明のアプリのインストール」の許可を求められますので、恐れ入りますがそのままインストールのボタンを押していただきますようお願いします  
お手数をおかけしますが、よろしくお願いします  
<br>  
<img width="200" alt="ito1" src="https://i.gyazo.com/65a9f519475a7953fddbc94f447de7ac.png">

アプリを開きますと上のような画像が表示されます。
ターンテーブルをタップして頂くと、画像が変わりBGMが流れ始めます。

<br>  
<img width="200" alt="ito3" src="https://i.gyazo.com/c73d98a6f46270c8b479c577d69ffb37.png">

ターンテーブルの画像が変わりBGMが流れます。
下の6つのボタンをリズムに合わせて押し、演奏してください。
<br>  

# 今後実装したいこと
- ビューの改善
- 音をさらに追加
- ラグが発生するため、なかなかうまく操作できないところを改善
- ゲームの内容をもう少し変更する。例：楽譜のようなものを作り、そこに音を配置していくような

# 変更履歴
- ver.1.0(1)  一通りの機能を実装完了し、デプロイが完了