package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!km", name = "Pc", descriptor = "I")
	public static int renderX;

    @OriginalMember(owner = "client!km", name = "pc", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!km", name = "tc", descriptor = "Lclient!na;")
	private static final JagString aClass100_641 = JagString.parse("Dec");

	@OriginalMember(owner = "client!km", name = "vc", descriptor = "Lclient!na;")
	private static final JagString aClass100_642 = JagString.parse("Jul");

	@OriginalMember(owner = "client!km", name = "xc", descriptor = "Lclient!na;")
	private static final JagString aClass100_644 = JagString.parse("May");

	@OriginalMember(owner = "client!km", name = "yc", descriptor = "Lclient!na;")
	private static final JagString aClass100_645 = JagString.parse("Nov");

	@OriginalMember(owner = "client!km", name = "zc", descriptor = "Lclient!na;")
	private static final JagString aClass100_646 = JagString.parse("Mar");

	@OriginalMember(owner = "client!km", name = "Gc", descriptor = "Lclient!na;")
	private static final JagString aClass100_649 = JagString.parse("Jan");

	@OriginalMember(owner = "client!km", name = "Hc", descriptor = "Lclient!na;")
	private static final JagString aClass100_650 = JagString.parse("Feb");

	@OriginalMember(owner = "client!km", name = "Tc", descriptor = "Lclient!na;")
	private static final JagString aClass100_655 = JagString.parse("Apr");

	@OriginalMember(owner = "client!km", name = "Wc", descriptor = "Lclient!na;")
	private static final JagString aClass100_656 = JagString.parse("Jun");

	@OriginalMember(owner = "client!km", name = "Qc", descriptor = "Lclient!na;")
	private static final JagString aClass100_653 = JagString.parse("Aug");

	@OriginalMember(owner = "client!km", name = "cd", descriptor = "Lclient!na;")
	private static final JagString aClass100_657 = JagString.parse("Sep");

	@OriginalMember(owner = "client!km", name = "dd", descriptor = "Lclient!na;")
	private static final JagString aClass100_658 = JagString.parse("Oct");

	@OriginalMember(owner = "client!km", name = "Ac", descriptor = "[Lclient!na;")
	public static final JagString[] aClass100Array102 = new JagString[] { aClass100_649, aClass100_650, aClass100_646, aClass100_655, aClass100_644, aClass100_656, aClass100_642, aClass100_653, aClass100_657, aClass100_658, aClass100_645, aClass100_641 };

    @OriginalMember(owner = "client!km", name = "Mc", descriptor = "Lclient!na;")
	public static final JagString LOGINSCREEN = JagString.parse("loginscreen");

	@OriginalMember(owner = "client!km", name = "Rc", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!km", name = "Sc", descriptor = "Lclient!na;")
	public static final JagString TRADE = JagString.parse(":trade:");

	@OriginalMember(owner = "client!km", name = "ad", descriptor = "I")
	public static int fp = 0;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(III)I")
	public static int method2695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

}